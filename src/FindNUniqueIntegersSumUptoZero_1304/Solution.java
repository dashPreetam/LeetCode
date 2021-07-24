package FindNUniqueIntegersSumUptoZero_1304;
/*

 * Date : 21/07/21

 * Author : SWASTIK PREETAM DASH

 */
public class Solution {

    public int[] sumZero(int n) {
        int[] array = new int[n];

        for (int i = 0; i < n / 2; i++) {
            array[i] = i+1;
            array[n-1-i] = -1 * array[i];
        }
        if(n % 2 != 0)
            array[n/2] = 0;

        return array;
    }
}
