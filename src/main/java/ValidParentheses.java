/** https://leetcode.com/problems/valid-parentheses/ */

import java.util.Stack;
public class ValidParentheses {

    private static final String OPENINGBRACKETS = "({[";
    private static final String CLOSINGBRACKETS = ")}]";

    static boolean isValid1(String s) {
        int size = s.length();
        Stack<Character> stack = new Stack<>(); //creating a stack

        for (int i = 0; i <size ; i++) {
            char c = s.charAt(i);

            //adding opening brackets in the string to the stack
            if (isOpeningBrackets(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || !isMatchingBrackets(c, stack.pop()))
                return false;
        }
        System.out.println(stack.size());
        return stack.isEmpty();
    }

    //checking if the index of the opening and closing brackets are equal
    private static boolean isMatchingBrackets(char close, char open) {
        return CLOSINGBRACKETS.indexOf(close) == OPENINGBRACKETS.indexOf(open);
    }


    //checking if each character in the string is an opening bracket
    private static boolean isOpeningBrackets(char c) {
        return OPENINGBRACKETS.indexOf(c) != -1;
    }

    public static boolean isValid(String s) {
        String test = "";
        while (!test.equals(s)) {
            test = s;
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid1("(]"));
        System.out.println(isValid1("({{[]}})"));

    }
}
