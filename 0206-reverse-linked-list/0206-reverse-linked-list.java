/**
 * Definition for singly-linked list.
 * public class ListListNode {
 *     int val;
 *     ListListNode next;
 *     ListListNode() {}
 *     ListListNode(int val) { this.val = val; }
 *     ListListNode(int val, ListListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode tempNext;
        ListNode tempPrev = null;
        while (currentNode != null) {
            tempNext = currentNode.next;
            currentNode.next = tempPrev;
            tempPrev = currentNode;
            currentNode = tempNext;
        }
        head = tempPrev;
        return head;
    }
}