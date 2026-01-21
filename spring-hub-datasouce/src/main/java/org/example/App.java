package org.example;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        // DruidDataSource dataSource = ctx.getBean("dataSource", DruidDataSource.class);
        // log.info("{}", dataSource);

        ComboPooledDataSource comboPooledDataSource = ctx.getBean("cDataSource", ComboPooledDataSource.class);
        log.info("c3p0: {}", comboPooledDataSource);
    }
}
