package leetcode.LeetCode.LinkedLists;

public class MyDoublyLinkedList {
	
public static void main(String[] args) {
		/*
		MyDoublyLinkedList linkedList = new MyDoublyLinkedList();
		linkedList.addAtHead(1);
		linkedList.addAtTail(3);
		linkedList.addAtIndex(1,2);
		linkedList.get(1);
		linkedList.deleteAtIndex(1);
		linkedList.get(1);
		*/
		
		MyDoublyLinkedList linkedList = new MyDoublyLinkedList();
		linkedList.addAtHead(84);
		linkedList.addAtTail(2);
		linkedList.addAtTail(39);
		linkedList.get(3);
		linkedList.get(1);
		linkedList.addAtTail(42);
		linkedList.addAtIndex(1,80);
		linkedList.addAtHead(14);
		linkedList.addAtHead(1);
		linkedList.addAtTail(53);
		linkedList.addAtTail(98);
		linkedList.addAtTail(19);
		linkedList.addAtTail(12);
		linkedList.get(2);
		linkedList.addAtHead(16);
		linkedList.addAtHead(33);
		linkedList.addAtIndex(4,17);
		linkedList.addAtIndex(6,8);
		linkedList.addAtHead(37);
		linkedList.addAtTail(43);
		linkedList.deleteAtIndex(11);
		linkedList.addAtHead(80);
		linkedList.addAtHead(31);
		linkedList.addAtIndex(13,23);
		linkedList.addAtTail(17);
		linkedList.get(4);
		linkedList.addAtIndex(10,0);
		linkedList.addAtTail(21);
		linkedList.addAtHead(73);
		linkedList.addAtHead(22);
		linkedList.addAtIndex(24,37);
		linkedList.addAtTail(14);
		linkedList.addAtHead(97);
		linkedList.addAtHead(8);
		linkedList.get(6);
		linkedList.deleteAtIndex(17);
		linkedList.addAtTail(50);
		linkedList.addAtTail(28);
		linkedList.addAtHead(76);
		linkedList.addAtTail(79);
		linkedList.get(18);
		linkedList.deleteAtIndex(30);
		linkedList.addAtTail(5);
		linkedList.addAtHead(9);
		linkedList.addAtTail(83);
		linkedList.deleteAtIndex(3);
		linkedList.addAtTail(40);
		linkedList.deleteAtIndex(26);
		linkedList.addAtIndex(20,90);
		linkedList.deleteAtIndex(30);
		linkedList.addAtTail(40);
		linkedList.addAtHead(56);
		linkedList.addAtIndex(15,23);
		linkedList.addAtHead(51);
		linkedList.addAtHead(21);
		linkedList.get(26);
		linkedList.addAtHead(83);
		linkedList.get(30);
		linkedList.addAtHead(12);
		linkedList.deleteAtIndex(8);
		linkedList.get(4);
		linkedList.addAtHead(20);
		linkedList.addAtTail(45);
		linkedList.get(10);
		linkedList.addAtHead(56);
		linkedList.get(18);
		linkedList.addAtTail(33);
		linkedList.get(2);
		linkedList.addAtTail(70);
		linkedList.addAtHead(57);
		linkedList.addAtIndex(31,24);
		linkedList.addAtIndex(16,92);
		linkedList.addAtHead(40);
		linkedList.addAtHead(23);
		linkedList.deleteAtIndex(26);
		linkedList.get(1);
		linkedList.addAtHead(92);
		linkedList.addAtIndex(3,78);
		linkedList.addAtTail(42);
		linkedList.get(18);
		linkedList.addAtIndex(39,9);
		linkedList.get(13);
		linkedList.addAtIndex(33,17);
		linkedList.get(51);
		linkedList.addAtIndex(18,95);
		linkedList.addAtIndex(18,33);
		linkedList.addAtHead(80);
		linkedList.addAtHead(21);
		linkedList.addAtTail(7);
		linkedList.addAtIndex(17,46);
		linkedList.get(33);
		linkedList.addAtHead(60);
		linkedList.addAtTail(26);
		linkedList.addAtTail(4);
		linkedList.addAtHead(9);
		linkedList.get(45);
		linkedList.addAtTail(38);
		linkedList.addAtHead(95);
		linkedList.addAtTail(78);
		linkedList.get(54);
		linkedList.addAtIndex(42,86);


	
	}
	    
	    Node head;
	    Node tail;
	    
	    class Node {
	        
	        private int value;
	        private Node next;
	        private Node prev;
	        
	        public Node(int value) {
	            this.value = value;
	        }
	        
	        public int getValue() {
	            return this.value;
	        }
	        
	        public Node getNext() {
	            return this.next;
	        }
	        
	        public Node getPrev() {
	            return this.prev;
	        }
	        
	        public void setNext(Node next) {
	            this.next = next;
	        }
	        
	        public void setValue(int value) {
	            this.value = value;
	        }
	        
	        public void setPrev(Node prev) {
	            this.prev = prev;
	        }
	    }

	    /** Initialize your data structure here. */
	    public MyDoublyLinkedList() {
	    }
	    
	    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	    public int get(int index) {
	        if(head != null) {
	            int counter = 0;
	            Node current = head;
	            while(current != null) {
	                if(counter == index) {
	                    return current.getValue();
	                }
	                current = current.next;
	                counter++;
	            }
	        }
	        return -1;
	    }
	    
	    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	    public void addAtHead(int val) {
	        Node newNode = new Node(val);
	        if(head == null) {
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }
	    
	    /** Append a node of value val to the last element of the linked list. */
	    public void addAtTail(int val) {
	        Node newNode = new Node(val);
	        if(tail == null) {
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	    }
	    
	    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
	    public void addAtIndex(int index, int val) {
	        if(head != null) {
	            int counter = 0;
	            Node current = head;
	            if(index == 0) {
	                Node newNode = new Node(val);
	                newNode.next = head;
	                head.prev = newNode;
	                head = newNode;
                    if(tail == null) {
	                	tail = newNode;
	                }
	            }
                else {
                    while(current != null && 1 + counter <= index) {
                        if(1 + counter == index) {
                            Node newNode = new Node(val);
                            newNode.next = current.next;
                            current.next = newNode;
                            newNode.prev = current;
                            if(current == tail) {
                                tail = newNode;
                            }
                            else {
                                newNode.next.prev = newNode;
                            }
                        }
                        current = current.next;
                        counter++;                
                    }
                }
	        }
	        else if(index == 0) {
	            Node newNode = new Node(val);
	            head = newNode;
	            tail = newNode;
	        }
	    }
	    
	    /** Delete the index-th node in the linked list, if the index is valid. */
	    public void deleteAtIndex(int index) {
	        
	        Node current = head;
	        if(index <= 0) {
	            current = current.next;
	            if(current == null) {
	                head = null;
	                tail = null;
	            }
	            else {
	                head.next = null;
	                head = current;
	                current.prev = null;
	            }
	        }
	        else {
	            int counter = 0;
	            while(current != null & counter <= index) {
	                if(counter == index) {
	                	if(current == tail) {
	                		tail = current.prev;
	                		tail.next = null;
	                		current.prev = null;
	                	}
	                	else {
	                		current.prev.next = current.next;
	                		current.next.prev = current.prev;
	                		current.next = null;
	                		current.prev = null;
	                	}             
	                }
                    current = current.next;
	                counter++;   
	        }
	    }
	}
}

	/**
	 * Your MyLinkedList object will be instantiated and called as such:
	 * MyLinkedList obj = new MyLinkedList();
	 * int param_1 = obj.get(index);
	 * obj.addAtHead(val);
	 * obj.addAtTail(val);
	 * obj.addAtIndex(index,val);
	 * obj.deleteAtIndex(index);
	 */