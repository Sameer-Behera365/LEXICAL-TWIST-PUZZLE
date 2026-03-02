package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {
    static int vowels(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray())
            if ("aeiou".indexOf(c) != -1)
                count++;
        return count;
    }

    static int consonants(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray())
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1)
                count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1 = sc.nextLine();
        String w2 = sc.nextLine();
        String combined = w1 + w2;
        System.out.println("Vowels = " + vowels(combined));
        System.out.println("Consonants = " + consonants(combined));
    }
}
