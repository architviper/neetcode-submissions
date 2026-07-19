/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode list = new ListNode();

        //ListNode start = head;
        ListNode nextx = null;
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            nextx = curr;
            curr = curr.next;
            nextx.next = prev;
            prev = nextx;
        }
    return prev;
    }
}
