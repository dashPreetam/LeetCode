package RemoveNthNodeFromENdOfList_19;
/*

 * Date : 16/08/21

 * Author : SWASTIK PREETAM DASH

 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    int total = 0;

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = recurse(head,n,1);
        return result.next;
    }

    private ListNode recurse(ListNode head, int n, int position) {
        return null;
    }
}
