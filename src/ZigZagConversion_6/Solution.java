package ZigZagConversion_6;
/*

 * Date : 27/07/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("A",1));
    }

    public String convert(String s, int numRows) {

        if(numRows == 1)
            return s;

        String[][] rows = new String[numRows][s.length()];
        int currentRow = 0;
        int currentCharacterIndex = 0;
        int index = 0;
        boolean goingUp = false;
        while (currentCharacterIndex < s.length()){
            rows[currentRow][index] = "" + s.charAt(currentCharacterIndex);
            currentCharacterIndex++;
            index++;
            if (goingUp){
                if(currentRow == 0){
                    currentRow = 1;
                    goingUp = false;
                } else {
                    currentRow--;
                }
            }else {
                if(currentRow == numRows - 1){
                    currentRow = numRows - 2;
                    goingUp = true;
                } else {
                    currentRow++;
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                String c = rows[i][j];
                if(c != null) {
                    res.append(c);
                    System.out.print(c + " ");
                }
            }
            System.out.println();
        }
        return res.toString();
    }
}
