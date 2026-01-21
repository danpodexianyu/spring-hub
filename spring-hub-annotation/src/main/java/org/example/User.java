package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component(value = "user")
public class User {

    private static final Logger log = LoggerFactory.getLogger(User.class);

    public User() {
        log.info("User creating...");
    }

    @PostConstruct
    public void init() {
        log.info("init...");
    }

    @PreDestroy
    public void destroy() {
        log.info("destroy...");
    }
}
