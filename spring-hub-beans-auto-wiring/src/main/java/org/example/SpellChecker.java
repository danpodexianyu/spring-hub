package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpellChecker {
    private static final Logger log = LoggerFactory.getLogger(SpellChecker.class);

    public SpellChecker() {
        log.info("Inside SpellChecker constructor.");
    }

    public void check() {
        log.info("Inside check.");
    }
}
