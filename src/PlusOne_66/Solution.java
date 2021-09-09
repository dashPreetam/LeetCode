package PlusOne_66;
/*

 * Date : 05/09/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{0})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9,9,9,9})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{1,9})));
    }

    public int[] plusOne(int[] digits) {
        System.out.println("\n"+Arrays.toString(digits));
        int carry = 1;
        int pos = digits.length;

        do{
            pos--;
            int x = digits[pos] + carry;
            if (x >= 10) {
                x = x - 10;
            } else carry = 0;
            digits[pos] = x;
        }while(carry != 0 && pos >= 1);
        System.out.println(pos);
        System.out.println(carry);
        if(carry !=0)
        {
            int[] copy = new int[digits.length + 1];
            System.arraycopy(digits, 0, copy, 0, digits.length);
            copy[0] = carry;
            return copy;
        }
        return digits;
    }

}
