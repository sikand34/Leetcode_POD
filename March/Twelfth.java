import java.util.HashMap;

public class Twelfth {
    class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        //Code Starts here:
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int sum = 0;
        map.put(0,dummy);
        while(head!= null){
            sum = sum+head.val;
            map.put(sum, head);
            head = head.next;
        }
        head = dummy;
        sum =0;
        while(head != null){
            sum += head.val;
            ListNode temp = map.get(sum);
            if(temp != head){
                head.next = temp.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
}
