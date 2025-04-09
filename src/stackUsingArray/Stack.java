package stackUsingArray;

public class Stack {

	int stackArray[];

	int top;

	public Stack(int size) {
		stackArray = new int[size];
		top = -1;
	}

	public void push(int value) {
		// TODO Auto-generated method stub
		if (top == stackArray.length - 1) {
			System.out.println("Stack Overflow");
			return;
		}
		stackArray[++top] = value;

	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Nothing to peek");
			return -1;
		}
		return stackArray[top];
	}

	public int pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return -1;
		}

		System.out.println("Element popped");
		return stackArray[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void display() {

		if (isEmpty()) {
			System.out.println("Nothing to display");
			return;
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.print(stackArray[i] + " ");
			}
			System.out.println();
		}

	}

}
