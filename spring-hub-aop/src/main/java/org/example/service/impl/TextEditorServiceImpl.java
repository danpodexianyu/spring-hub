package org.example.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.service.TextEditorService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TextEditorServiceImpl implements TextEditorService {

    @Override
    public void save() {
        log.info("text editor save running.");
    }

    @Override
    public void edit() {
        log.info("text editor edit running.");
    }

    @Override
    public void delete() {
        log.info("text editor delete running.");
    }
}
