public class Twentieth {
    class Solution {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            //Code Starts here:
            ListNode curr = list1;
            int c = 0;
            while(c<a-1){
                curr = curr.next;
                c++;
            }
            ListNode front = curr;
            while(c<=b){
                curr = curr.next;
                c++;
            }
            ListNode end = curr;
            front.next = list2;
            while(list2.next!=null){
                list2 = list2.next;
            }
            list2.next = end;
            return list1;
        }
    }
}
