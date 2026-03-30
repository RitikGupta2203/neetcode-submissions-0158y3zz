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
       ArrayList<Integer> arr = new ArrayList<>();
       ListNode head1= list1;
       ListNode head2 = list2;

        while(head1!= null){
            arr.add(head1.val);
            head1= head1.next;
        }
        while(head2!= null){
            arr.add(head2.val);
            head2= head2.next;
        }

        Collections.sort(arr);

        ListNode res = new ListNode(-1);
        ListNode curr = res;  
        for(int i : arr){
            curr.next = new ListNode(i);
            curr = curr.next;
        }

        return res.next;
        
    }
}