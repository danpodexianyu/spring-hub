package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SetterBasedTextEditor {
    private static final Logger log = LoggerFactory.getLogger(SetterBasedTextEditor.class);

    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.check();
    }
}
