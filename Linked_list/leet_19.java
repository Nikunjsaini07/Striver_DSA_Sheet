
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head ;
        
        
        while(temp!=null){
            length++;
            temp= temp.next;
        }
        int index = length - n ;
        if(index == 0 ){
            temp = head.next ;
            head.next = null;
            return temp;
        }
        temp = head ;
        while(index>1){
            index--;
            head = head.next ;
        }
        head.next = head.next.next;
        
        return temp ;
    }
}