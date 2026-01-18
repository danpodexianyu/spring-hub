package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextEditor {
    private static final Logger log = LoggerFactory.getLogger(TextEditor.class);

    private final SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        log.info("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.check();
    }
}
