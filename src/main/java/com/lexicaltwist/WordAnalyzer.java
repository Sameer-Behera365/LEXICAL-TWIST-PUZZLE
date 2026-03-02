package com.lexicaltwist;

public class WordAnalyzer {
    public int countVowels(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray())
            if ("aeiou".indexOf(c) != -1)
                count++;
        return count;
    }

    public int countConsonants(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray())
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1)
                count++;
        return count;
    }

    public String transform(String word) {
        return word.toUpperCase();
    }

    public String decide(String combined) {
        int v = countVowels(combined);
        int c = countConsonants(combined);
        if (v > c) return "Vowel heavy word pattern";
        else if (c > v) return "Consonant heavy word pattern";
        else return "Balanced character pattern";
    }
}
