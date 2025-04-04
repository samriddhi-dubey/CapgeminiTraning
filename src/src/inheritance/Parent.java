package inheritance;

public class Parent {
	static int a=10;
	int b=20;
	
	static void print() {
      System.out.println("This is a static method");
	}
	public void message() {
		System.out.println("Thus is a non-static mthod");
	}
	
	static {
		System.out.println("statiic initializer");
	}
	{
		System.out.println("Non static initializer");
	}
	
	Parent(){
		System.out.println("Parent constructor");
	}

}
