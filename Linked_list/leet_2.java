
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        
        ListNode ans = new ListNode();
        ListNode temp = ans; 
        while( l1 != null ||  l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null  ){
                sum = sum + l1.val ;
                l1= l1.next;     
            }
            if( l2 != null ){
              sum = sum + l2.val ;
              l2= l2.next;
            }
            int rem = sum%10;
            carry = sum /10;
            temp.next = new ListNode(rem);
            temp = temp.next;
        }
        return ans.next;
        
    }
}