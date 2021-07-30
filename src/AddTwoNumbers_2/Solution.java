package AddTwoNumbers_2;
/*

 * Date : 24/07/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode();
        ListNode head = result;

        while (l1 != null || l2 != null){
            int x;
            if (l1 != null && l2 != null){
                x = carry + l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            } else if(l1 == null){
                x = carry + l2.val;
                l2 = l2.next;
            } else {
                x = carry + l1.val;
                l1 = l1.next;
            }
            carry = x >= 10 ? 1 : 0;
            x = x >= 10 ? x - 10 : x;
            result.next = new ListNode(x,null);
            result = result.next;
        }

        if (carry != 0)
            result.next = new ListNode(carry,null);

        return head.next;
    }

}
