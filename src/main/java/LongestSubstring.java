/** https://leetcode.com/problems/longest-substring-without-repeating-characters/  */

import java.util.*;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {

        int length = s.length();
        int max = 0;

        //specifying two pointers
        int i = 0;
        int j = 0;

        //declaring an empty set
        Set<Character> set = new HashSet<>();

        //checking for extreme cases
        if(s.isEmpty()) return 0;

        //while the firstpointer is not more than the length of the string
        while(i<length) {

            //checks if the set does not contain the character at index i. If true,
            // add the character to the set and increment i by 1. Then find the size
            // of the set and check if it is greater than the max value. If true,
            // assign the value of size to the value of the max
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                i++;

                int size = set.size();

                if(size>max) max = size;

                // checks if the set contains the character at index i. If true, the
                // character at index j is removed from the set and the j index is
                // incremented by 1, until the point at which the character at index i
                // is not present in the set
            } else {
                set.remove(s.charAt(j));
                j++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("qrsvbspk")); //5
        System.out.println(lengthOfLongestSubstring("pwwkew")); //3
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("abba")); //2
    }
}
