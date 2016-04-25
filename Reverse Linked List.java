/**
 *Reverse a linked list.
 *Example
 *For linked list 1->2->3, the reversed linked list is 3->2->1
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {           //recursion
        if(head == null || head.next == null){
            return head;
        }
        ListNode reverseNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return reverseNode;
    }
    public ListNode reverse(ListNode head) {            //loop
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
}
