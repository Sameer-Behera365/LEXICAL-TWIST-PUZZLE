package com.lexicaltwist;

public class LexicalAnalyzer {

    public String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public String transform(String word) {
        return word.toLowerCase().replaceAll("[aeiou]", "@");
    }

    public int countVowels(String word) {
        int count = 0;
        for (char c : word.toUpperCase().toCharArray()) {
            if ("AEIOU".indexOf(c) >= 0) {
                count++;
            }
        }
        return count;
    }

    public int countConsonants(String word) {
        int count = 0;
        for (char c : word.toUpperCase().toCharArray()) {
            if (Character.isLetter(c) && "AEIOU".indexOf(c) < 0) {
                count++;
            }
        }
        return count;
    }

    public String firstTwoUnique(String word, boolean wantVowels) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : word.toUpperCase().toCharArray()) {
            boolean isVowel = "AEIOU".indexOf(c) >= 0;
            boolean isConsonant = Character.isLetter(c) && !isVowel;
            boolean match = wantVowels ? isVowel : isConsonant;
            if (match && sb.indexOf(String.valueOf(c)) < 0) {
                sb.append(c);
                count++;
                if (count == 2) break;
            }
        }
        return sb.toString();
    }
}