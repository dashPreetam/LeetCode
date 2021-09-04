package Subsets2_90;
/*

 * Date : 05/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[] nums = {0};
        //int[] nums = {1, 2, 2};
        int[] nums = {4,4,4,1,4};
        System.out.println(solution.subsetsWithDup(nums));
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> globalList = new ArrayList<>();
        helper(0, new ArrayList<>(), nums, globalList);
        return globalList;
    }

    private void helper(int position, List<Integer> currentList, int[] nums, List<List<Integer>> globalList) {
        if (position > nums.length - 1) {
            System.out.println(currentList);
            currentList.sort(Comparator.naturalOrder());
            if (!globalList.contains(currentList))
                globalList.add(currentList);
        } else {
            List<Integer> copyList = new ArrayList<>(currentList);
            copyList.add(nums[position]);
            helper(position + 1, currentList, nums, globalList);
            helper(position + 1, copyList, nums, globalList);
        }
    }
}
