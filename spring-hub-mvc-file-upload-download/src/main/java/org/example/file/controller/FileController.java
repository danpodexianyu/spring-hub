package org.example.file.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/files")
public class FileController {

    @PostMapping("/upload")
    public ResponseEntity<String> upload(HttpServletRequest request, @RequestParam("file") MultipartFile file) throws IOException {
        // 获取请求参数的名字
        String fileName = file.getName();
        // 获取文件的名字
        String originalFileName = file.getOriginalFilename();
        log.info("file name: {}, original file name: {}", fileName, originalFileName);

        // 上传文件
        // 获取输入流，读取上传的文件
        InputStream inputStream = file.getInputStream();
        // 封装成带有缓冲区的输入流
        BufferedInputStream bis = new BufferedInputStream(inputStream);

        // 上传到服务器的文件夹
        BufferedOutputStream bos = getBufferedOutputStream(request, originalFileName);

        byte[] bytes = new byte[1024 * 10];
        int readCount = 0;
        while ((readCount = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, readCount);
        }

        bos.flush();
        bos.close();
        bis.close();

        return ResponseEntity.ok("ok");
    }

    @GetMapping("/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request, HttpServletResponse response) throws IOException {
        File file = new File(request.getServletContext().getRealPath("/upload") + "/1.jpg");
        // 创建响应头对象
        HttpHeaders headers = new HttpHeaders();
        // 设置响应内容类型
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        // 设置下载文件的文件名
        headers.setContentDispositionFormData("attachment", file.getName());
        return new ResponseEntity<>(Files.readAllBytes(file.toPath()), headers, HttpStatus.OK);
    }

    private static BufferedOutputStream getBufferedOutputStream(HttpServletRequest request, String originalFileName) throws FileNotFoundException {
        ServletContext servletContext = request.getServletContext();
        String realPath = servletContext.getRealPath("/upload");
        File uploadFolder = new File(realPath);
        // 如果文件夹不存在，则创建文件夹
        if (!uploadFolder.exists()) {
            uploadFolder.mkdir();
        }
        // 获取输入流
        // File destFile = new File(uploadFolder.getAbsolutePath() + "/" + originalFileName);
        String fileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));
        File destFile = new File(uploadFolder.getAbsolutePath() + "/" + fileName);
        // 封装成带有缓冲区的输入流
        return new BufferedOutputStream(new FileOutputStream(destFile));
    }

}
