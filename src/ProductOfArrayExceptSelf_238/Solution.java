package ProductOfArrayExceptSelf_238;
/*

 * Date : 04/09/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{-1, 1, 0, 0, -3, 3})));
    }

    public int[] productExceptSelf(int[] nums) {
        int zeroCounter = 0;
        int[] res = new int[nums.length];
        int entireProduct = 1;

        for (int x : nums) {
            if (x == 0) {
                zeroCounter++;
                if (zeroCounter >= 2) {
                    Arrays.fill(res, 0);
                    return res;
                }
            } else {
                entireProduct *= x;
            }
        }

        System.out.println(entireProduct);
        System.out.println(zeroCounter);

        for (int i = 0; i < res.length; i++) {
            if (nums[i] != 0) {
                if (zeroCounter == 1)
                    res[i] = 0;
                else
                    res[i] = entireProduct / nums[i];
            } else
                res[i] = entireProduct;
        }

        return res;
    }
}
