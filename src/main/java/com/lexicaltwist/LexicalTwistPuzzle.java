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
            System.out.println("Not a reverse pair.");
        }

        sc.close();
    }
}