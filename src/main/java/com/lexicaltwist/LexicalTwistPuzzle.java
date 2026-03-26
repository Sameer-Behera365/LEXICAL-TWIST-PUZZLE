package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordValidator validator = new WordValidator();
        LexicalAnalyzer analyzer = new LexicalAnalyzer();

        System.out.print("Enter first word: ");
        String w1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String w2 = sc.nextLine();

        if (!validator.isValid(w1) || !validator.isValid(w2)) {
            System.out.println(w1 + " is an invalid word");
            return;
        }

        String rev = analyzer.reverse(w1);

        if (rev.equalsIgnoreCase(w2)) {
            System.out.println("Transformed: " + analyzer.transform(rev));
        } else {
            String combined = (w1 + w2).toUpperCase();
            int v = analyzer.countVowels(combined);
            int c = analyzer.countConsonants(combined);

            if (v > c) {
                System.out.println("First 2 unique vowels: " + analyzer.firstTwoUnique(combined, true));
            } else if (c > v) {
                System.out.println("First 2 unique consonants: " + analyzer.firstTwoUnique(combined, false));
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }

        sc.close();
    }
}
