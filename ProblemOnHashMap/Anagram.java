package ProblemOnHashMap;

import java.util.*;

public class Anagram {

    // Class for HashMap
    public static HashMap<Character, Integer> makeFreqMap(String str) {

        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq + 1);
            }
        }
        return mp;

    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> mp1 = makeFreqMap(s);
        HashMap<Character, Integer> mp2 = makeFreqMap(t);
        return mp1.equals(mp2);

    }

    public static void main(String[] args) {
        Anagram anagramChecker = new Anagram();

        String str1 = "listent";
        String str2 = "silent";

        if (anagramChecker.isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
        }

    }
}
