package FirstMissingPositive_41;
/*

 * Date : 06/09/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstMissingPositive(new int[] {1,2,0}));
        System.out.println(solution.firstMissingPositive(new int[] {3,4,-1,1}));
        System.out.println(solution.firstMissingPositive(new int[] {7,8,9,11,12}));
        System.out.println(solution.firstMissingPositive(new int[] {0,2,2,1,1}));
    }

    public int firstMissingPositive1(int[] nums) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        HashSet<Integer> checker = new HashSet<>();

        for (int num: nums) {
            if (num > 0 && !checker.contains(num)) {
                heap.add(num);
                checker.add(num);
            }
        }

        int missing = 1;

        while(!heap.isEmpty() && heap.peek() == missing){
            heap.poll();
            missing++;
        }

        return missing;
    }

    public int firstMissingPositive(int[] nums){

        int[] res = new int[nums.length + 1];
        Arrays.fill(res,0);


        for (int num: nums) {
            if(num >= 0 && num <= nums.length)
            res[num] = 1;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (res[i] == 0)
                return i;
        }

        return nums.length+1;
    }

}
