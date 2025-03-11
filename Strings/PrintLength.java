package Strings;

class PrintLength {

    // Method to calculate length of a string

    static int getLength(String s) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            System.out.println(c);
            cnt++;
        }

        return cnt;
    }

    // Method to print if two strings are equal or not

    static String isEqual(String str1, String Str2) {
        return str1.equals(Str2) ? "Yes" : "No";
        // if (str1 == Str2) {
        // return "Yes";
        // }

        // return "No";
    }

    // check character by character

    static String areStringEquals(String s1, String s2) {
        // Compare length first
        if (s1.length() != s2.length()) {
            return "No";
        }

        // compare character by character

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i) + " " + s2.charAt(i));
            if (s1.charAt(i) != s2.charAt(i)) {
                return "No";
            }
        }

        return "Yes";
    }

    static int searchCharInString(String str, char ch) {

        // System.out.println(str.toCharArray());

        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }

        // for (int i = 0; i < str.toCharArray().length; i++) {
        // if (str.charAt(i) == ch) {
        // return i;
        // }

        // }

        return -1;

    }

    static String insertcharOnPos(String str, int pos, char ch) {
        StringBuilder res = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (i == pos) {
                res.append(ch);

            }
            res.append(str.charAt(i));
        }

        if (pos >= str.length()) {
            res.append(ch);
        }

        return res.toString();
    }

    static String removeStringFromPos(String str, int pos) {

        if (pos < 0 || pos >= str.length()) {
            return "Invalid Position";
        }
        StringBuilder res = new StringBuilder(str);

        res.deleteCharAt(pos);

        return res.toString();

    }

    static String removeCharfromStringWithPos(String str, int pos) {

        String result = "";
        if (str == null || pos < 0 || pos >= str.length()) {
            return "Invalid Position";
        }

        for (int i = 0; i < str.length(); i++) {
            if (i != pos) {
                result += str.charAt(i);
            }
        }

        return result;

    }

    static String addStar(String str, int stars[]) {
        String ans = "";
        int j = 0;

        for (int i = 0; i < str.length(); i++) {
            if (j < stars.length && stars[j] == i) {
                ans += '*';
                j++;
            }
            ans += str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "HelloWorld!";
        String str1 = "Hello!";
        String str2 = "Hello!";
        char k = 'c';
        int stars[] = { 2, 5, 7, 9 };
        // System.out.println("Length of the string is: " + str.length());
        // System.out.println("Length of the string is: " + getLength(str));
        // System.out.println("is Both Strings Equal: " + isEqual(str1, str2));
        // System.out.println(searchCharInString(str1, k));
        // System.out.println(insertcharOnPos(str1, 6, k));
        System.out.println(removeStringFromPos(str1, 1));
        System.out.println(removeCharfromStringWithPos(str1, 1));
        System.out.println(addStar(str, stars));
    }
}