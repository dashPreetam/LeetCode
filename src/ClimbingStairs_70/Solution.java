package ClimbingStairs_70;
/*

 * Date : 09/09/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i = 0; i < 11; i++) {
            System.out.println(i + " -> " + solution.climbStairs(i));
        }
        System.out.println(solution.climbStairs(20));
    }


    public int climbStairs(int n) {
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        if (n == 2)
            return 2;

        int[] res = new int[n + 1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 2;

        for (int i = 3; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }

        return res[n];
    }

}
