package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordValidator validator = new WordValidator();
        WordAnalyzer analyzer = new WordAnalyzer();

        System.out.println("Lexical Twist Puzzle");
        System.out.print("Enter first word: ");
        String w1 = sc.nextLine();
        System.out.print("Enter second word: ");
        String w2 = sc.nextLine();

        if (!validator.isValid(w1) || !validator.isValid(w2)) {
            System.out.println("Invalid input. Only single words allowed.");
            return;
        }

        if (validator.isReverse(w1, w2))
            System.out.println("Transformed = " + analyzer.transform(w1));
        else
            System.out.println("Words are NOT reverse of each other");

        String combined = w1 + w2;
        System.out.println("Vowels = " + analyzer.countVowels(combined));
        System.out.println("Consonants = " + analyzer.countConsonants(combined));
        System.out.println(analyzer.decide(combined));
    }
}
