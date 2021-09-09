package ShiftingLetters_848;
/*

 * Date : 08/09/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.shiftingLetters("abc", new int[]{3, 5, 9}));
        System.out.println(solution.shiftingLetters("aaa", new int[]{1, 2, 3}));
        System.out.println(solution.shiftingLetters("bad", new int[]{10, 20, 30}));
        System.out.println(solution.shiftingLetters("ruu", new int[]{26, 9, 17}));
        System.out.println(solution.shiftingLetters("xrdofd", new int[]{70, 41, 71, 72, 73, 84}));

    }

    public String shiftingLetters(String s, int[] shifts) {

        StringBuilder res = new StringBuilder();
        int lastShift = 0;

        for (int i = shifts.length - 1; i >= 0; i--) {

            //init shift
            int shift = shifts[i];

            // calculate shift
            shift = shift + lastShift;
            if (shift >= 26)
                shift %= 26;

            // add shift and rotate
            int og = (int) s.charAt(i);
            int mod = og + shift;
            if (mod > (int) 'z')
                mod -= 26;

            res.append((char) mod);
            lastShift = shift;
        }

        return res.reverse().toString();
    }
}
