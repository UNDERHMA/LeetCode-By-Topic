package leetcode.LeetCode.LinkedLists;


public class MergeTwoSortedLists {
	private class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null){
            return null;
        }
        else if(l2 == null){
            return l1;
        }
        else if(l1 == null) {
            return l2;
        }
        
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode temp;
        
        while(node1 != null && node2 != null){
            if(node1.val <= node2.val) {
                temp = node1.next;
                if(temp != null) {
                    if(temp.val <= node2.val) {
                        node1 = temp;
                    }
                    else {
                        node1.next = node2;
                        node1 = temp;
                    }
                }
                else {
                    node1.next = node2;
                    node1 = temp;
                }
            }
            else if(node2.val < node1.val) {
                temp = node2.next;
                if(temp != null) {
                    if(temp.val < node1.val) {
                        node2 = temp;
                    }
                    else {
                        node2.next = node1;
                        node2 = temp;
                    }
                }
                else {
                    node2.next = node1;
                    node2 = temp;
                }
            }
        }
        
        if(l1.val <= l2.val) {
            return l1;
        }
        else {
            return l2;
        }
    }
}
