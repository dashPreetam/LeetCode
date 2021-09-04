package RemoveElement_27;
/*

 * Date : 17/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,2,2,3,0,4,2};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int k = solution.removeElement(nums, 2);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public int removeElement(int[] nums, int val) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " " + val + " " + p);
            if (nums[i] != val) {
                nums[p] = nums[i];
                p++;
            }
        }
        return p;
    }
}
