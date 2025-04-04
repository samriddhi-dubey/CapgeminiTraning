package interfaces;

public interface A {
	
	int a=10;
	
	static void message() {
		System.out.println("thi sis interface A");
	}
	
	default void print() {
		System.out.println("Hey");
	}

}
