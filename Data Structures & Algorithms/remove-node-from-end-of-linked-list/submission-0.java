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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0 ;
        ListNode temp = head;
        ListNode curr = head;
        ListNode nextNode = head;

        while(temp!= null){
            count++;
            temp = temp.next;
        }

           // if we need to remove the head
        if (n == count) {
            return head.next;
        }

        int element = count -n -1; //node before the one to delete
        int curCount = 0;
        while(curr != null){
            if(curCount == element){
                 curr.next = curr.next.next; // delete
                break; // stop after deleting
            }
            curCount++;
            curr = curr.next;
        }
    return head;
    }
}
