package org.example.service.impl;

import org.example.config.SpringConfig;
import org.example.service.TextEditorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(SpringConfig.class)
class TextEditorServiceImplTest {

    @Autowired
    private TextEditorService textEditorService;

    @Test
    void testAop() {
        textEditorService.save();
    }

}