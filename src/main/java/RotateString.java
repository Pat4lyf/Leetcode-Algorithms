/** https://leetcode.com/problems/rotate-string/ */
public class RotateString {
    public static boolean rotateString(String s, String goal) {
        int count = 1;
        int length1 = s.length();
        int length2 = goal.length();

        if(length1 != length2) return false;

        while(!s.equals(goal)) {
            if(count == length1) return false;

            char firstCharacter = s.charAt(0);
            s = s.substring(1) + firstCharacter;
            count++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab")); //true
        System.out.println(rotateString("abcde", "abced")); //false
    }
}
