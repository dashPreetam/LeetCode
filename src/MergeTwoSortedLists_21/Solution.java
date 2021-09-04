package MergeTwoSortedLists_21;

/*

 * Date : 16/08/21

 * Author : SWASTIK PREETAM DASH

 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        //ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4,null)));
        //ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4,null)));
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        System.out.println(solution.mergeTwoLists(l1, l2));
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        ListNode head = new ListNode();
        ListNode result = head;
        head.next = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                result.next = l1;
                l1 = l1.next;
            } else {
                result.next = l2;
                l2 = l2.next;
            }

            result = result.next;
        }
        while (l1 != null) {
            result.next = l1;
            l1 = l1.next;
            result = result.next;
        }
        while (l2 != null) {
            result.next = l2;
            l2 = l2.next;
            result = result.next;
        }

        return head.next;
    }

}
