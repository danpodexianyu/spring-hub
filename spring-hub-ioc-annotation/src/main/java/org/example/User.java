package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {

    private static final Logger log = LoggerFactory.getLogger(User.class);

    public User() {
        log.info("User creating...");
    }
}
