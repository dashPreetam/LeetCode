package TrappingRainWater_42;
/*

 * Date : 01/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[] height = {4,2,0,3,2,5};
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        //int[] height = {5,5,1,7,1,1,5,2,7,6};
        //int[] height = {4,3,3,9,3,0,9,2,8,3};
        //int[] height = {9,3,0,9,2,8,3};
        //int[] height = {0, 1, 2, 0, 3, 0, 1, 2, 0, 0, 4, 2, 1, 2, 5, 0, 1, 2, 0, 2};
        System.out.println(solution.trap(height));
    }

    public int trap(int[] height) {

        int total = 0;

        int start = 0;
        int end = 0;
        while (end < height.length) {
            if (end + 1 >= height.length)
                break;
            end = nextGreat(height, end + 1, height[start]);
            System.out.println(start + "<----->" + end);
            int trapped = 0;
            int sum = findSum(start, end, height);
            int area = Math.min(height[start], height[end]) * (end - start - 1);
            trapped = area - sum;
            if (trapped > 0)
                total += trapped;
            start = end;
        }
        return total;
    }

    private int findSum(int start, int end, int[] height) {
        int sum = 0;
        for (int i = start + 1; i <= end - 1; i++) {
            sum += height[i];
        }
        return sum;
    }

    private int nextGreat(int[] height, int i, int curr) {
        int great = i;
        for (int j = i + 1; j < height.length; j++) {
            if (height[j] > height[great]) {
                great = j;
            }
            if (height[great] > curr) {
                return great;
            }
        }
        return great;
    }
}
