package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {
    static boolean isReverse(String w1, String w2) {
        return new StringBuilder(w1).reverse().toString().equals(w2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1 = sc.nextLine();
        String w2 = sc.nextLine();

        if (isReverse(w1, w2))
            System.out.println("Words are reverse of each other");
        else
            System.out.println("Words are NOT reverse of each other");
    }
}
