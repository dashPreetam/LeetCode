package SqrtX_69;
/*

 * Date : 08/09/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.mySqrt(4));
//        System.out.println(solution.mySqrt(8));
//        System.out.println(solution.mySqrt(5));
//        System.out.println(solution.mySqrt(18));
        System.out.println(solution.mySqrt(2147395599));
    }

    public int mySqrt(int x) {
        if(x <= 0)
            return 0;

        int l = 1, r = 46340;
        int ans = 1;

        while (l <= r){
            int mid = (l+r) / 2;
            int midSq = mid * mid;
            System.out.println(mid + " " + midSq);

            if(midSq == x){
                return mid;
            } else if(midSq < x){
                l = mid +1;
                ans = mid;
            }else  r = mid-1;
        }
        return ans;
    }

}
