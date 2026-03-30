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

    // input: Linked List , n: the node we have to remove
    //output : Linked List after removed list
    //Plan: 
    //1. count the total number of nodes in Linked List
    //2. get the element before the nth Node
    //3. iterate the loop to reach to nth node -1 and remove.
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0 ;
        ListNode temp = head;
        ListNode curr = head;

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
