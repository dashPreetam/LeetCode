package BestTimeToBuyAndSellStocks_121;
/*

 * Date : 04/09/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {7,1,5,3,6,4};
        //int[] nums = {2,4,1};
        //int[] nums = {7,6,4,3,1};
        System.out.println(solution.maxProfit(nums));
    }

    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int greatest = prices[0];
        int max = Integer.MIN_VALUE;

        for (int val : prices) {
            if (val < lowest){
                lowest = val;
                greatest = val;
            }
            if(val > greatest){
                greatest = val;
            }
            System.out.println(lowest+" "+greatest+" :" + (greatest-lowest));
            max = Math.max(max,greatest-lowest);
        }

        return max;
    }
}
