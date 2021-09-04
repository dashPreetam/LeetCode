package RemoveDupliactesFromArray_26;
/*

 * Date : 17/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public int removeDuplicates(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0, p = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[p] = nums[i];
                p++;
            }
        }

        return set.size();
    }
}
