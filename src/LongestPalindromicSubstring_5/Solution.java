package LongestPalindromicSubstring_5;
/*

 * Date : 26/07/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("aacabdkacaa"));
    }

    public String longestPalindrome(String s) {

        String res = "";


        for (int i = 0; i < s.length(); i++) {
            String newWord = growBothSides("",i, i,s.length(),s);
            res = res.length() > newWord.length() ? res : newWord;
            newWord = growBothSides(""+s.charAt(i)+"",i, i,s.length(),s);
            res = res.length() > newWord.length() ? res : newWord;
            newWord = growBothSides("",i, i+1,s.length(),s);
            res = res.length() > newWord.length() ? res : newWord;
        }
        return res;
    }

    String growBothSides(String origin, int start, int end, int endExtent, String s){
        String word = origin;
        while (start >= 0 && end < endExtent){
            if(start != end ){
                if(s.charAt(start) == s.charAt(end))
                word = s.charAt(start) + word + s.charAt(end);
                else break;
            }
            start--;
            end++;
        }
        return word;
    }
}