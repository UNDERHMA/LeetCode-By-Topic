package leetcode.LeetCode.LinkedLists;

public class MyLinkedList {
	
	public static void main(String[] args) {
		
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtHead(7);
		linkedList.addAtHead(2);
		linkedList.addAtHead(1);
		linkedList.addAtIndex(3,0);
		linkedList.deleteAtIndex(2);
		linkedList.addAtHead(6);
		linkedList.addAtTail(4);
		linkedList.get(4);
		linkedList.addAtHead(4);
		linkedList.addAtIndex(5,0);
		linkedList.addAtHead(6);
		/*
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtHead(2);
		linkedList.deleteAtIndex(1);
		linkedList.addAtHead(2);
		linkedList.addAtHead(7);
		linkedList.addAtHead(3);
		linkedList.addAtHead(2);
		linkedList.addAtHead(5);
		linkedList.get(5);
		linkedList.addAtHead(5);
		linkedList.deleteAtIndex(6);
		linkedList.get(5);
		linkedList.deleteAtIndex(4);
		*/
	}
		
    Node head;
    Node tail;
    
    class Node {
        
        private int value;
        private Node next;
        
        public Node(int value) {
            this.value = value;
        }
        
        public int getValue() {
            return this.value;
        }
        
        public Node getNext() {
            return this.next;
        }
        
        public void setNext(Node next) {
            this.next = next;
        }
        
        public void setValue(int value) {
            this.value = value;
        }
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {
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
                head = newNode;
            }
            while(current != null) {
                if(1 + counter == index) {
                    Node newNode = new Node(val);
                    newNode.next = current.next;
                    current.next = newNode;
                    if(current == tail) {
                        tail = newNode;
                    }
                }
                current = current.next;
                counter++;                
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
        if(index == 0) {
            current = current.next;
            if(current == null) {
                head = null;
                tail = null;
            }
            else {
                head.next = null;
                head = current;
            }
        }
        else {
            int counter = 0;
            while(current != null) {
                if(1 + counter == index) {
                	if(current == tail) {
                		current = null;
                		break;
                	}
                    Node temp = current.next;
                    if(temp == tail) {
                    	current.next = null;
                    	tail = current;
                    }
                    else {
                    	current.next = temp.next;
                    }
                    temp.next = null;
                }
                current = current.next;
                counter++;                
            }
        }
    }
}
