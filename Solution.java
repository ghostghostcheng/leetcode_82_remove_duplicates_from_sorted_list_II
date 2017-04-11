package leetcode_82_remove_duplicates_from_sorted_list_II;


public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode resultNode = new ListNode(0);
        ListNode tmpNode = resultNode;
        if (head == null || head.next == null) {
            return head;
        }
        
        int lastNum = head.val;
        head = head.next;
        int counter = 0;
        
        while(head != null) {
            if (head.val != lastNum) {
                if (counter == 0) {
                    tmpNode.next = new ListNode(lastNum);
                    tmpNode = tmpNode.next;
                } else {
                    counter = 0;
                }
            } else {
                counter++;
            }
            
            lastNum = head.val;
            head = head.next;
        }
        
        if (counter == 0) {
            tmpNode.next = new ListNode(lastNum);
        }
        
        return resultNode.next;
    }
}