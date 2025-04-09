package stackUsingLinkedList;

public class Stack {
	    Node top;
	    int size;
	    int capacity;

	    public Stack(int capacity) {
	        this.capacity = capacity;
	        this.size = 0;
	        this.top = null;
	    }

	    public void push(int value) {
	        if (size == capacity) {
	            System.err.println("Stack Overflow");
	            return;
	        }

	        Node newNode = new Node(value);
	        newNode.next = top; //becuase it uses FIFO
	        top = newNode;
	        size++;
	    }

	    public int pop() {
	        if (isEmpty()) {
	            System.err.println("Stack Underflow");
	            return -1;
	        }

	        int popped = top.data;
	        top = top.next;
	        size--;
	        return popped;
	    }

	    public int peek() {
	        if (isEmpty()) {
	            System.err.println("Stack is empty");
	            return -1;
	        }
	        return top.data;
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }

	    public void printStack() {
	        if (isEmpty()) {
	            System.err.println("Stack is empty");
	            return;
	        }

	        Node current = top;
	        while (current != null) {
	            System.err.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	

}
