package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {
    static int vowelCount(String word) {
        int v = 0;
        for (char c : word.toLowerCase().toCharArray())
            if ("aeiou".indexOf(c) != -1)
                v++;
        return v;
    }

    static int consonantCount(String word) {
        int c = 0;
        for (char ch : word.toLowerCase().toCharArray())
            if (Character.isLetter(ch) && "aeiou".indexOf(ch) == -1)
                c++;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String combined = sc.nextLine() + sc.nextLine();
        int v = vowelCount(combined);
        int c = consonantCount(combined);

        if (v > c)
            System.out.println("Vowel heavy word pattern");
        else if (c > v)
            System.out.println("Consonant heavy word pattern");
        else
            System.out.println("Balanced character pattern");
    }
}
