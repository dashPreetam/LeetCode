package RemoveZeroSumConsecutiveNoedsFromLinkedList_1171;
/*

 * Date : 22/07/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {

    public static void main(String[] args) {
        ListNode head = new ListNode(5,new ListNode(1,new ListNode(-1,null)));
        Solution solution = new Solution();
        System.out.println(solution.removeZeroSumSublists(head));
    }

    public ListNode removeZeroSumSublists(ListNode head) {

        ListNode temp = new ListNode();
        temp.next = head;

        for (ListNode i = temp; i != null; i = i.next) {
            int sum = 0;
            for (ListNode j = i.next; j != null; j = j.next) {
                sum += j.val;
                if(sum == 0) {
                    i.next = j.next;
                }
            }

        }

        return temp.next;

    }
}