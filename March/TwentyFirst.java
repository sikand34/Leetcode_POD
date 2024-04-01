public class TwentyFirst {
    class Solution {
        public ListNode reverseList(ListNode head) {
            //Code Starts here:
            ListNode prev = null;
            ListNode curr = head;
            if(head == null){
                return head;
            }
            while(curr.next!=null){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            curr.next = prev;
            return curr;
        }
    }
}
