package CombinationSum_39;
/*

 * Date : 08/09/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum(new int[]{2, 2, 6, 7, 3}, 7));
        System.out.println(solution.combinationSum(new int[]{2, 3, 5}, 8));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        res = new ArrayList<>();
        Arrays.sort(candidates);

        for (int i = 0; i < candidates.length; i++) {
            helper(i, target, new ArrayList<>(), candidates);
        }
        return res;
    }

    private void helper(int pos, int target, List<Integer> list, int[] candidates) {

        if (target == 0) {
            if (!res.contains(list))
                res.add(list);
            return;
        }


        if (target < 0)
            return;


        for (int i = pos; i < candidates.length; i++) {
            if ((pos > 0 && candidates[pos] == candidates[pos-1])||candidates[i] < 0) {
                continue;
            }
            List<Integer> copy = new ArrayList<>(list);
            copy.add(candidates[i]);
            helper(i, target - candidates[i], copy, candidates);
        }

    }

    List<List<Integer>> res;
}
