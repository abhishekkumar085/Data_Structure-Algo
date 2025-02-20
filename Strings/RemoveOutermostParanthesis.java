package Strings;

public class RemoveOutermostParanthesis {

    public static String removeOutermostParenthesis(String s) {
        StringBuilder result = new StringBuilder();

        int openCount = 0;
        

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (openCount > 0) {
                    result.append(c);
                }
                openCount++;
            } else {
                openCount--;
                if (openCount > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Remove Outermost Parenthesis!");
        String input2 = "(()())";

        System.out.println(removeOutermostParenthesis(input2));

    }
}
