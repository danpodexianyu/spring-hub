package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TextEditorTest {

    @Test
    void testAutoWiring() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        TextEditor textEditor = ctx.getBean("textEditor", TextEditor.class);
        textEditor.spellCheck();
    }

}