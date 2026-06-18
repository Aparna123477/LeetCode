/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        //
        ListNode tmp=null;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;

           if(s==f){
            f=head;
            while(s!=f){
                s=s.next;
                f=f.next;
            }
            return f;
           }
        }
return null;
    }
}