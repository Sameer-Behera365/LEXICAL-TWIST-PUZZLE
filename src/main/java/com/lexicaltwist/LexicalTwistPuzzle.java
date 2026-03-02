package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {
    static boolean isValid(String word) {
        return word.matches("[a-zA-Z]+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String w1 = sc.nextLine();
        System.out.print("Enter second word: ");
        String w2 = sc.nextLine();

        if (!isValid(w1) || !isValid(w2)) {
            System.out.println("Invalid input. Only single words allowed.");
            return;
        }
        System.out.println("Valid inputs accepted");
    }
}
