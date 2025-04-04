package interfaces;

public interface C extends A,B {
	
	default void check() {
		System.out.println(A.a);
		A.message();
		B.message();
		print();
	}
	@Override
	default void print() {
//		A.super.print();
		B.super.print();
	}
	
	public static void main(String[] args) {
//		check(); cannot access a default method in static context
	}

}
