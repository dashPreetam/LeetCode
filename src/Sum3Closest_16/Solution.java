package Sum3Closest_16;
/*

 * Date : 07/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.sql.SQLOutput;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[] nums = {-1, 2, 1, -4};
        //int[] nums = {1, 1, -1, -1, 3};
        //int[] nums = {1, 1, -1, -1, 3};
        int[] nums = {4,0,5,-5,3,3,0,-4,-5};
        System.out.println(solution.threeSumClosest(nums, -2));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];

        for (int i = 0; i <= nums.length - 1; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                System.out.print(nums[i] + " " + nums[l] + " " + nums[r]);
                int sum = nums[i] + nums[l] + nums[r];
                int diff = Math.abs(target - sum);
                int xdiff = Math.abs(target - closest);

                if (diff < xdiff)
                    closest = sum;

                if (sum > target)
                    r--;
                else l++;

                System.out.println("->" + sum + " & " + diff);
            }
        }
        return closest;
    }
}
