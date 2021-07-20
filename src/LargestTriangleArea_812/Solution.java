package LargestTriangleArea_812;
/*

 * Date : 20/07/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {
    public double largestTriangleArea(int[][] points) {
        double result = Double.MIN_VALUE;

        for (int i = 0; i < points.length; i++) {
            double x1 = points[i][0];
            double y1 = points[i][1];
            for (int j = 0; j < points.length; j++) {
                double x2 = points[j][0];
                double y2 = points[j][1];
                for (int k = 0; k < points.length; k++) {
                    double x3 = points[k][0];
                    double y3 = points[k][1];

                    double area = 0.5 * ( (x1*(y2-y3)) + (x2*(y3-y1)) + (x3*(y1-y2)) );
                    if (area > result)
                        result = area;
                }
            }
        }
        return result;
    }
}
