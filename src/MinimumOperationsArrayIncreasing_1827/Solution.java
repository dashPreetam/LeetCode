package MinimumOperationsArrayIncreasing_1827;
/*

 * Date : 18/07/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {

    public int minOperations(int[] nums) {
        int ops = 0;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] <= nums[i-1]){
                ops += nums[i-1] - nums[i] + 1;
                nums[i] = nums[i-1]+1;
            }
        }

        return ops;
    }
}
