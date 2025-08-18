class Solution {
    public ListNode middleNode(ListNode head) {ListNode curr = head; 
    ListNode nxt = head;

    while (nxt != null && nxt.next != null && nxt.next.next!=null){
    nxt = nxt.next.next;
    curr = curr.next;

    }

    if(nxt.next!=null){ 
        return curr.next;
        }

        return curr;
        
    }
}
