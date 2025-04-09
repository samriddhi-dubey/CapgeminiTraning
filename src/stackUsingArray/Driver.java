package stackUsingArray;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		Stack stack = new Stack(size);
		
        while(flag) {
        	System.out.println("Enter 1 to push\nEnter 2 to pop\nEnter 3 to display\nEnter 4  to peek\nEnter 5 to exit");
    		int choice = sc.nextInt();
        	
        	switch(choice) {
        	case 1:
        		System.out.print("Enter the element to push:");
        		int value=sc.nextInt();
        		stack.push(value);
        		break;
        	case 2: 
        		
        		stack.pop();
        		break;
        	case 3:
        		stack.display();
        		break;
        	case 4:
        		stack.peek();
        		break;
        	case 5:
        		flag=false;
        		break;
        	}
        }
	}
}
