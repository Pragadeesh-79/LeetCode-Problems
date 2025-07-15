class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode previous = null;
        ListNode current = head;
        ListNode next = current.next;
        while(current != null){
            current.next = previous;
            previous = current;
            current = next;
            if(next != null){
                next = current.next;
            }
        }  
        head = previous;
        return previous;      
    }
}