package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class ExampleBeanTest {

    @Test
    void testInit() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        ExampleBean exampleBean = ctx.getBean("exampleBean", ExampleBean.class);
        exampleBean.getMessage();
    }

    @Test
    void testDestroy() {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        ExampleBean exampleBean = ctx.getBean("destroyExampleBean", ExampleBean.class);
        exampleBean.getMessage();
        ctx.registerShutdownHook();
    }

}