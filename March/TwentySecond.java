public class TwentySecond {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            //Code Starts here:
            ListNode curr = head;
            ListNode sl = head;
            ListNode fs = head.next;
            while(fs != null && fs.next != null){
                sl = sl.next;
                fs = fs.next.next;
            }
            
            ListNode prev = null; 
            ListNode itr = sl.next;
            while(itr!=null){
                ListNode next = itr.next;
                itr.next = prev;
                prev = itr;
                itr = next;
            }
            sl.next = prev;
            sl = sl.next;
            while(sl!=null){
                if(curr.val!=sl.val){
                    return false;
                }
                curr = curr.next;
                sl = sl.next;
            }
            return true;
        }
    }
}
