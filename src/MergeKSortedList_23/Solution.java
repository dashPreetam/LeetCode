package MergeKSortedList_23;
/*

 * Date : 17/08/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0)
            return null;

        if (lists.length == 1)
            return lists[0];

        ListNode[] pair = lists.length % 2 == 0 ? new ListNode[lists.length / 2] : new ListNode[(lists.length / 2) + 1];

        for (int i = 0, c = 0; i < lists.length; i += 2, c++) {
            if (i + 1 >= lists.length) {
                pair[c] = lists[i];
            } else {
                pair[c] = mergeTwoLists(lists[i], lists[i + 1]);
            }
        }

        return mergeKLists(pair);

    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
