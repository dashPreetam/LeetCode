package MaxDifferenceYouCanGetFromChangingAnInteger_1432;
/*

 * Date : 21/07/21

 * Author : SWASTIK PREETAM DASH

 */

//TODO Space optimization, if else improvement

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        //System.out.println(solution.equalNumberOfDigits(1101057+"",0000057+""));
        System.out.println(solution.maxDiff(1101057));
    }

    public int maxDiff(int num) {
        if(num < 10)
            return 8;
        int a = bestPossible(num+"","Greatest");
        int b = bestPossible(num+"","Least");

        return  a - b;
    }

    private int bestPossible(String num, String type) {
        int bestPossible;
        bestPossible = Integer.parseInt(num);


        for (int i = 0; i < num.length(); i++) {
            String newNum = "";
            char c = num.charAt(i);
            if(type == "Least"){
                if (i == 0 && c == '1') {
                }
                else {
                    if(i==0)
                        newNum = num.replace(c, '1');
                    else
                        newNum = num.replace(c, '0');
                    if(Integer.parseInt(newNum) == 0)
                        newNum = num.replace(c,'1');
                    if(Integer.parseInt(newNum) < bestPossible && equalNumberOfDigits(num,newNum)) {
                        bestPossible = Integer.parseInt(newNum);
                        break;
                    }
                }
            } else {
                if (i == 0 && c == '9') {
                }
                else {
                    newNum = num.replace(c, '9');
                    if(bestPossible < Integer.parseInt(newNum)) {
                        bestPossible = Integer.parseInt(newNum);
                        //break;
                    }
                }
            }
        }
        return bestPossible;
    }

    private boolean equalNumberOfDigits(String numString, String newNumString) {

        int num = Integer.parseInt(numString);
        int newNum = Integer.parseInt(newNumString);

        if((int) Math.log10(num) == (int) Math.log10(newNum))
            return true;

        return false;
    }
}
