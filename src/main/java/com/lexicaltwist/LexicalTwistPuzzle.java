package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String w1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String w2 = sc.nextLine();

        if (w1.contains(" ") || w2.contains(" ")) {
            System.out.println(w1 + " is an invalid word");
            return;
        }

        String rev = new StringBuilder(w1).reverse().toString();

        if (rev.equalsIgnoreCase(w2)) {
            String transformed = rev.toLowerCase().replaceAll("[aeiou]", "@");
            System.out.println("Transformed: " + transformed);
        } else {
            String combined = (w1 + w2).toUpperCase();
            int vowels = 0;
            int consonants = 0;

            for (char c : combined.toCharArray()) {
                if ("AEIOU".indexOf(c) >= 0) {
                    vowels++;
                } else if (Character.isLetter(c)) {
                    consonants++;
                }
            }

            System.out.println("Combined: " + combined);
            System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
        }

        sc.close();
    }
}