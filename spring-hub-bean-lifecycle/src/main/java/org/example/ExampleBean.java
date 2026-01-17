package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleBean implements InitializingBean, DisposableBean {

    private static final Logger log = LoggerFactory.getLogger(ExampleBean.class);

    private String message;

    // configure in XML-based configuration metadata
    public void init() {
        // do some initialization work
        log.info("init - XML-based configuration");
    }

    // configure in XML-based configuration metadata as well
    public void xmlBasedDestroy() {
        // do some destruction works
        log.info("destroy = XML-based destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("init - after properties set...");
    }

    @Override
    public void destroy() throws Exception {
        log.info("destroy - by implement disposableBean");
    }

    public void getMessage() {
        log.info("Your Message: {}", message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
