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
    public boolean hasCycle_brute(ListNode head) {

        Set<ListNode> visited = new HashSet<ListNode>();
        ListNode temp = head;

        while(temp != null) {
           if(visited.contains(temp)) {
             return true;
           }
           visited.add(temp);
           temp = temp.next;
        }
        return false;    
    }

    public boolean hasCycle(ListNode head) {
      
       ListNode slow =head;
       ListNode fast = head;
       while(fast!=null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast) {
            return true;
        }
       }    
       return false;
    }
}