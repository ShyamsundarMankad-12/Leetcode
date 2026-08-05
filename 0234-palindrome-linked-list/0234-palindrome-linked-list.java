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
    public boolean isPalindrome(ListNode head) {
        // Logic :- find middel node and then reverse second half and then compare first half and second half
        if(head==null || head.next==null) return true; 
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalfHead = reverseLL(slow.next);
        ListNode fc = head;
        ListNode sc = secondHalfHead;
        while(sc!=null){
            if(fc.val!=sc.val) return false;
            sc = sc.next;
            fc = fc.next;
        }
        return true;
    }
    public ListNode reverseLL(ListNode a){
        ListNode prev = null;
        ListNode curr = a;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}