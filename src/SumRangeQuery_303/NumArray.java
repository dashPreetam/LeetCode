package SumRangeQuery_303;
/*

 * Date : 16/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.Arrays;

public class NumArray {

    int[] numbers;

    public NumArray(int[] nums) {
        numbers = Arrays.copyOf(nums,nums.length);
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum+=numbers[i];
        }
        return sum;
    }
}
