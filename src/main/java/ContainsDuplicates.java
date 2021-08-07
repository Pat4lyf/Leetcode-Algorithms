/** https://leetcode.com/problems/contains-duplicate/ */

import java.util.Arrays;

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new  int[] {2,14,18,22,22}));
    }
}
