
/** https://leetcode.com/contest/weekly-contest-249/problems/unique-length-3-palindromic-subsequences/  */

import java.util.HashSet;
import java.util.Set;


public class UniquePalindromicSubsequence {

    public static int countPalindromicSubsequence(String s) {
        int size = 0;


        for(char c='a'; c<='z'; c++) {
            int start = s.indexOf(c);
            int end = s.lastIndexOf(c);

            //for every character, the characters between the start and the end indices
            //of the character is added to the a new set and the size is determined

            if(start != end) {
                Set<Character> set = new HashSet<>();

                for(int i= start+1; i<=end-1; i++) {
                    set.add(s.charAt(i));
                }
                size += set.size();

            }
        }
        return size;
    }

    public static void main(String[] args) {
        System.out.println(countPalindromicSubsequence("bbcbaba")); //4
    }
}
