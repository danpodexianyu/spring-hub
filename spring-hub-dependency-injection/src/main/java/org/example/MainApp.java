package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        // Example - Usage of Constructor Based Dependency Injection
        TextEditor textEditor = ctx.getBean("textEditor", TextEditor.class);
        textEditor.spellCheck();

        // Example - Usage of Setter Based Dependency Injection
        SetterBasedTextEditor setterBasedTextEditor = ctx.getBean("setterBasedTextEditor", SetterBasedTextEditor.class);
        setterBasedTextEditor.spellCheck();
    }
}
