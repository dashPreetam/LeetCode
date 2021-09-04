package LetterCombinationsOfAPhoneNumber_17;
/*

 * Date : 15/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
    }

    HashMap<Character, List<Character>> keypad;

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty())
            return res;
        initKeypad();
        res.add("");
        for (char digit : digits.toCharArray()) {
            List<Character> characters = keypad.get(digit);
            List<String> newRes = new ArrayList<>();
            for (String text : res) {
                for (Character character : characters){
                    newRes.add(text+character);
                }
            }
            res.clear();
            res.addAll(newRes);
        }
        return res;
    }

    private void initKeypad() {
        keypad = new HashMap<>();
        keypad.put('2', Arrays.asList('a', 'b', 'c'));
        keypad.put('3', Arrays.asList('d', 'e', 'f'));
        keypad.put('4', Arrays.asList('g', 'h', 'i'));
        keypad.put('5', Arrays.asList('j', 'k', 'l'));
        keypad.put('6', Arrays.asList('m', 'n', 'o'));
        keypad.put('7', Arrays.asList('p', 'q', 'r','s'));
        keypad.put('8', Arrays.asList('t', 'u', 'v'));
        keypad.put('9', Arrays.asList('w', 'x', 'y','z'));

    }
}
