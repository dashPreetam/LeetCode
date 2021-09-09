package Permutations_46;
/*

 * Date : 07/09/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.permute(new int[]{1, 2, 3}));
        System.out.println(solution.permute(new int[]{0, 1}));
        System.out.println(solution.permute(new int[]{1}));
    }


    public List<List<Integer>> permute(int[] nums) {
        return helper(Arrays.stream(nums).boxed().collect(Collectors.toList()));
    }

    private List<List<Integer>> helper(List<Integer> nums) {
        List<List<Integer>> all = new ArrayList<>();
        if (nums.size() == 1) {
            all.add(nums);
        } else if (nums.size() == 2) {
            all.add(nums);
            List<Integer> newOrder = new ArrayList<>();
            newOrder.add(nums.get(1));
            newOrder.add(nums.get(0));
            all.add(newOrder);
        } else if (nums.size()>2){
            for (int x: nums) {
                List<Integer> newOrder = new ArrayList<>(nums);
                newOrder.remove(newOrder.indexOf(x));
                List<List<Integer>> sublists = helper(newOrder);

                for (List<Integer> sublist: sublists) {
                    sublist.add(0,x);
                    all.add(sublist);
                }
            }
        }

        return all;
    }

}
