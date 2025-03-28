package interfaces;

public interface B {
	double a=30;
	
	static void message() {
		System.out.println("thi sis interface A");
	}
	default void print() {
		System.out.println("Hi");
	}

}
