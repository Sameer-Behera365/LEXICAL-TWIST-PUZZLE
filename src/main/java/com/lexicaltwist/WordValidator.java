package com.lexicaltwist;

public class WordValidator {
    public boolean isValid(String word) {
        return word != null && word.matches("[a-zA-Z]+");
    }

    public boolean isReverse(String w1, String w2) {
        return new StringBuilder(w1).reverse().toString().equals(w2);
    }
}
