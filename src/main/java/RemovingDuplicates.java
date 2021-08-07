/** https://leetcode.com/problems/remove-duplicates-from-sorted-array/ */

import java.util.Arrays;

public class RemovingDuplicates {
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int count = 1;
        int j = 1;
            for(int i=0; i<length-1; i++) {
                while(nums[j] == nums[i] && j<length-1) {
                        j++;
                    }
                    nums[i+1] = nums[j];

                if (nums[i] != nums[i+1]) count++;
            }

        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static int removeDuplicates1(int[] nums) {
        int count = 1;
        for(int i=1; i<nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }
            nums[count-1] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates1(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }
}
