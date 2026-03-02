package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();
        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();
        System.out.println("Word1 = " + word1);
        System.out.println("Word2 = " + word2);
    }
}
