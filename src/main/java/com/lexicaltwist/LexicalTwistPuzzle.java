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

        System.out.println("Valid inputs: " + word1 + ", " + word2);

        scanner.close();
    }
}