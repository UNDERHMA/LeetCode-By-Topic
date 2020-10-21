package leetcode.LeetCode.LinkedLists;
 
public class AddTwoNumbers {
	private class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null) {
            return null;
        }
        else if(l1 == null) {
            return l2;
        }
        else if(l2 == null) {
            return l1;
        }
        
        
        ListNode numberOneLengthPointer = l1;
        ListNode numberTwoLengthPointer = l2;
        boolean l1Larger = true;
        int lengthCounter1 = 0;
        int lengthCounter2 = 0;
        
        while(numberOneLengthPointer != null && numberTwoLengthPointer != null) {
            numberOneLengthPointer = numberOneLengthPointer.next;
            numberTwoLengthPointer = numberTwoLengthPointer.next;
            if(numberOneLengthPointer != null) {
                lengthCounter1++;
            }
            if(numberTwoLengthPointer != null) {
                lengthCounter2++;
            }
        }
        
        ListNode currentLongerNumber;
        ListNode currentShorterNumber; 
        if(lengthCounter2 > lengthCounter1) {
            currentLongerNumber = l2;
            currentShorterNumber = l1;
            l1Larger = false;
        }
        else {
            currentLongerNumber = l1;
            currentShorterNumber = l2;
        }

        int carry = 0;
        while(currentLongerNumber != null) {
            if(currentShorterNumber == null){
                currentLongerNumber.val = currentLongerNumber.val + carry;
                carry = 0;
                if(currentLongerNumber.val > 9) {
                    carry = 1;
                    currentLongerNumber.val = currentLongerNumber.val % 10;
                    ListNode temp = currentLongerNumber;
                    currentLongerNumber = currentLongerNumber.next;
                    if(currentLongerNumber == null && carry == 1) {
                        ListNode largestDigitFromCarry = new ListNode();
                        largestDigitFromCarry.val = 1;
                        temp.next = largestDigitFromCarry;
                    }
                }
                else {
                    currentLongerNumber = currentLongerNumber.next;
                }
            }
            else{
                currentLongerNumber.val = currentLongerNumber.val + currentShorterNumber.val + carry;
                carry = 0;
                if(currentLongerNumber.val > 9) {
                    carry = 1;
                    currentLongerNumber.val = currentLongerNumber.val % 10;
                    ListNode temp = currentLongerNumber;
                    currentLongerNumber = currentLongerNumber.next;
                    currentShorterNumber = currentShorterNumber.next;
                    if(currentLongerNumber == null && carry == 1) {
                        ListNode largestDigitFromCarry = new ListNode();
                        largestDigitFromCarry.val = 1;
                        temp.next = largestDigitFromCarry;
                    }
                }
                else {
                    currentLongerNumber = currentLongerNumber.next;
                    currentShorterNumber = currentShorterNumber.next;
                }
            }
        }
        
        if(l1Larger) {
            return l1;
        }
        else {
            return l2;
        }
    }
}
