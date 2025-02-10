package ProblemOnHashMap;

import java.util.*;

public class IsoMorphicString {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);

            if (mp.containsKey(sCh)) {
                if (mp.get(sCh) != tCh) {
                    return false;
                }

            } else if (mp.containsValue(tCh)) {
                return false;
            } else {
                mp.put(sCh, tCh);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsoMorphicString obj = new IsoMorphicString();

        System.out.println(obj.isIsomorphic("egg", "add"));   // ✅ true
        System.out.println(obj.isIsomorphic("foo", "bar"));   // ❌ false
        System.out.println(obj.isIsomorphic("paper", "title"));// ✅ true
        System.out.println(obj.isIsomorphic("abc", "def"));   // ✅ true
        System.out.println(obj.isIsomorphic("ab", "aa"));     // ❌ false
    }

}
