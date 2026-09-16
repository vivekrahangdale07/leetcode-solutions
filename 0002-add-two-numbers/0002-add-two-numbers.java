class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        int carry = 0;
        while(l1 != null || l2 !=null || carry != 0){
           
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            int digit = sum % 10;
             
            t.next = new ListNode(digit);
            t = t.next;
         if (l1 != null) l1 = l1.next;
         if (l2 != null) l2 = l2.next;

        }
        return  dummy.next;
    }
}