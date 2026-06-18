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
        ListNode s=head;
        ListNode f=head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;

        }
        ListNode rs=reverse(s);
        ListNode fs=head;
        boolean ispal=true;

       while(rs!=null){
        if(rs.val!=fs.val){
            ispal=false;
            break;
        }
        rs=rs.next;
        fs=fs.next;
        
       }
       return ispal;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
        curr.next=prev;
            prev=curr;
            curr=next;
        }    
        return prev;

    
    }
}