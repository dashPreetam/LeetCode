package Matrix01_542;
/*

 * Date : 29/07/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.Arrays;

public class Solution {

    public int[][] updateMatrix(int[][] mat) {
        int[][] res = new int[mat.length][mat[0].length];
        for (int[] re : res) {
            Arrays.fill(re, Integer.MAX_VALUE);
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    res[i][j] = 0;
                    fillIJ(i, j, 1, res);
                } else
                    res[i][j] = minSur(i, j, res);

            }
        }
        boolean anyValueChanged = true;
        while (anyValueChanged){
            anyValueChanged = false;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (res[i][j] != 0) {
                        if(res[i][j] != minSur(i, j, res)){
                            anyValueChanged = true;
                        }
                        res[i][j] = minSur(i, j, res);

                    }
                }
            }
        }
        return res;
    }

    private int minSur(int i, int j, int[][] res) {
        int min = Integer.MAX_VALUE;
        if (i > 0) {
            min = res[i - 1][j];
        }
        if (j > 0) {
            min = Math.min(min, res[i][j - 1]);
        }
        if (i < res.length - 1) {
            min = Math.min(min, res[i + 1][j]);
        }
        if (j < res[0].length - 1) {
            min = Math.min(min, res[i][j + 1]);
        }
        if (min == Integer.MAX_VALUE)
            return min;
        else return min + 1;
    }

    private void fillIJ(int i, int j, int value, int[][] res) {
        if (i > 0) {
            res[i - 1][j] = Math.min(res[i - 1][j], value);
        }
        if (j > 0) {
            res[i][j - 1] = Math.min(res[i][j - 1], value);
        }
        if (i < res.length - 1) {
            res[i + 1][j] = Math.min(res[i + 1][j], value);
        }
        if (j < res[0].length - 1) {
            res[i][j + 1] = Math.min(res[i][j + 1], value);
        }
    }
}
