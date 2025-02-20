package Strings;

import java.util.Arrays;

public class ReverseWords {

    public static String reverseWord(String s) {
        String[] words = s.trim().split("\\s+");
        System.out.println("Words: " + Arrays.toString(words));

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println("Reverse String!");

        String sentence = "I love coding";

        System.out.println(reverseWord(sentence));

    }
}
