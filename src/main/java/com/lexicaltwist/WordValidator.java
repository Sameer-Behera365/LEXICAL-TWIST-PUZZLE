package com.lexicaltwist;

public class WordValidator {

    public boolean isValid(String word) {
        return !word.contains(" ");
    }
}