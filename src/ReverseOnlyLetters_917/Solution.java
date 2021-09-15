package ReverseOnlyLetters_917;
/*

 * Date : 15/09/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.reverseOnlyLetters("ab-cd"));
        System.out.println(solution.reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(solution.reverseOnlyLetters("Test1ng-Leet=code-Q!"));


    }

    public String reverseOnlyLetters(String s) {

        System.out.println("\n" + s);

        StringBuilder res = new StringBuilder();
        int pointer = s.length() - 1;

        for (int i = 0; i < s.length() && pointer >= 0; ) {
            char c = s.charAt(i);
            char p = s.charAt(pointer);

            if (isALetter(c) && isALetter(p)) {
                System.out.println(c + " " + p);
                System.out.println("Both letters, swap and move inward");
                res.append(p);
                pointer--;
                i++;
            } else if (!isALetter(c) && isALetter(p)) {
                System.out.println("<> " + p);
                System.out.println("C not letter, append and move c");
                res.append(c);
                i++;
            } else if (isALetter(c) && !isALetter(p)) {
                System.out.println(c + " <>");
                System.out.println("P not letter, move P");
                pointer--;
            } else {
                System.out.println("<> <>");
                System.out.println("Not letters, append C and moving inward");
                res.append(c);
                i++;
                pointer--;
            }
        }
        for (int i = res.length() ; i < s.length() ; i++) {
            res.append(s.charAt(i));
        }

        return res.toString();
    }

    private boolean isALetter(char c) {
        return (((int) c >= 97 && (int) c <= 122) || ((int) c >= 65 && (int) c <= 90));
    }

}
