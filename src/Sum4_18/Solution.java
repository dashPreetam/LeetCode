package Sum4_18;
/*

 * Date : 15/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[] nums = {1, 0, -1, 0, -2, 2};
        int[] nums = {2,2,2,2,2};
        System.out.println(solution.fourSum(nums,8));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int firstElement = 0; firstElement < nums.length - 3; firstElement++) {
            for (int secondElement = firstElement + 1; secondElement < nums.length - 2; secondElement++) {
                int thirdElement = secondElement + 1;
                int fourthElement = nums.length - 1;

                while (thirdElement < fourthElement){
                    int sum = nums[firstElement] + nums[secondElement] + nums[thirdElement] + nums[fourthElement];
                    if(sum == target){
                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[firstElement],nums[secondElement],nums[thirdElement],nums[fourthElement]));
                        if(!result.contains(list))
                        result.add(list);
                        fourthElement--;
                        thirdElement++;
                    }else if (sum > target)
                        fourthElement--;
                    else
                        thirdElement++;
                }
            }
        }
        return result;
    }
}
