package org.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class InjectingCollectionTest {
    private static final Logger log = LoggerFactory.getLogger(InjectingCollectionTest.class);

    @Test
    void testInjectingCollection() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        InjectingCollection ic = ctx.getBean("injectingCollection", InjectingCollection.class);

        log.info("List Elements: {}", ic.getAddressList());
        log.info("Set Elements: {}", ic.getAddressSet());
        log.info("Map Elements: {}", ic.getAddressMap());
        log.info("Properties Elements: {}", ic.getProperties());
    }

}