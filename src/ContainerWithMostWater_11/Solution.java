package ContainerWithMostWater_11;
/*

 * Date : 30/07/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {

    public int maxArea(int[] height) {

        int max = 0;

        int start = 0;
        int end = height.length-1;
        while (start<end){
            int area = Math.min(height[start],height[end]) * (end-start);
            max = Math.max(area,max);
            if (height[start] < height[end])
                start++;
            else
                end--;
        }

        return max;
    }
}
