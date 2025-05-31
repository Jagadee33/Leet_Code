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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || k<=0){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        for(int i =1;i<k;i++){
            fast =fast.next;
        }
        ListNode temp1 =fast;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode temp2 = slow;
        int res = temp1.val;
        temp1.val = temp2.val;
        temp2.val = res;

        return head;
    }
}