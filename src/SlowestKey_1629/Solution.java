package SlowestKey_1629;
/*

 * Date : 06/09/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        //int[] releaseTimes = {9,29,49,50}; String keysPressed = "cbcd";
        int[] releaseTimes = {12, 23, 36, 46, 62};
        String keysPressed = "spuda";
        System.out.println(solution.slowestKey(releaseTimes, keysPressed));

    }

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int pressed = 0;
        int duration = releaseTimes[0];
        char slowestKey = keysPressed.charAt(0);
        for (int i = 0; i < releaseTimes.length; i++) {
            System.out.println(keysPressed.charAt(i) + " " + pressed + " " + releaseTimes[i] + " " + " " + (releaseTimes[i] - pressed));
            if (releaseTimes[i] - pressed >= duration) {
                if(duration == releaseTimes[i] - pressed) {
                    if (keysPressed.charAt(i) > slowestKey)
                        slowestKey = keysPressed.charAt(i);
                }else
                    slowestKey = keysPressed.charAt(i);

                duration = releaseTimes[i] - pressed;
            }
            pressed = releaseTimes[i];
        }
        return slowestKey;
    }

}
