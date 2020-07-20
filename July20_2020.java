// Remove element from linked list - Ezee pizyy

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null){
            return head;
        }
        
        ListNode prev;
        ListNode cur = head;

        while(cur.next != null) {
            if(cur.next.val == val) {
                ListNode temp = cur.next;
                cur.next = cur.next.next;
                temp = null;
            }
            // if(cur.next != null) {
            //     break;
            // }
            else {
                cur = cur.next;
            }
        }
        
        if(head.val == val){
            ListNode temp = head;
            head = head.next;
            
            temp.next = null;
        }
        
        return head;
        
    }
}
