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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currentNode1 = list1;
        ListNode currentNode2 = list2;
        ListNode head1 = currentNode1;
        ListNode head2 = currentNode2;
        ListNode output1;
        if(head1 == null ) return head2;
        if(head2 == null ) return head1;
        if(head1.val<head2.val){
            output1 = head1;
            head1= head1.next;
        }else{
            output1 = head2;
            head2= head2.next;
        }
        ListNode lastNode = output1;
        while(head1!=null&&head2!= null){
            if(head1.val<head2.val){
                lastNode.next = head1;
                head1 = head1.next;
            }else{
                lastNode.next= head2;
                head2 = head2.next;
            }
            lastNode = lastNode.next;
        }
        if(head1!=null){
            lastNode.next = head1;
        }
        if(head2!=null){
            lastNode.next = head2;
        }
        return output1;
    }
}