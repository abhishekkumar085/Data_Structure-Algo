
import java.util.*;

public class Ana {

    private static boolean anagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> ana = new HashMap<>();

        for (char ch : s.toCharArray()) {
            ana.put(ch, ana.getOrDefault(ch, 0) + 1);

        }

        // decrease the count for t that is str2;

        for (char ch : t.toCharArray()) {
            if (!ana.containsKey(ch)) {
                return false;
            }
            ana.put(ch, ana.get(ch) - 1);
            if (ana.get(ch) == 0) {
                ana.remove(ch);
            }
        }

        return ana.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(anagram("listen", "sislent"));

    }

}
