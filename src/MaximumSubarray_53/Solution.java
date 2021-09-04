package MaximumSubarray_53;
/*

 * Date : 04/09/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(solution.maxSubArray(new int[]{5, 4, -1, 7, 8}));
        System.out.println(solution.maxSubArray(new int[]{1}));
    }

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currentMax = 0;
        for (int x : nums) {
            currentMax = currentMax + x;
            if (max < currentMax)
                max = currentMax;
            if (currentMax < 0)
                currentMax = 0;
        }
        return max;
    }
}
