package TwoSum_1;

import java.util.HashMap;

/*

 * Date : 24/07/21

 * Author : SWASTIK PREETAM DASH

 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];


        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                res[0] = i;
                res[1] = map.get(nums[i]);
                break;
            }else
                map.put(target - nums[i],i);
        }

        return res;

    }

}
