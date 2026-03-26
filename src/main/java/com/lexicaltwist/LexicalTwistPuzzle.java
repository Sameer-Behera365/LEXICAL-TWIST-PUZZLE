package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        if (word1.contains(" ") || word2.contains(" ")) {
            System.out.println(word1 + " is an invalid word");
            return;
        }

        String reversed = new StringBuilder(word1).reverse().toString();

        if (reversed.equalsIgnoreCase(word2)) {
            System.out.println("Words are reverse of each other.");
        } else {
            System.out.println("Words are NOT reverse of each other.");
        }

        scanner.close();
    }
}