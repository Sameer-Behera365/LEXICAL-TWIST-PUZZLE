package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {
    static boolean isReverse(String w1, String w2) {
        return new StringBuilder(w1).reverse().toString().equals(w2);
    }

    static String transform(String word) {
        return word.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1 = sc.nextLine();
        String w2 = sc.nextLine();

        if (isReverse(w1, w2))
            System.out.println("Transformed = " + transform(w1));
        else
            System.out.println("No transformation — not reverse pair");
    }
}
