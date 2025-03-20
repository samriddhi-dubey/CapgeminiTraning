package day3;

public class CompoundOperators {
	public static void main(String[]args) {
		byte b=10;
//		b=b+10; throws an error due to reassignment of operators, basically type mismatch as b=byte, 10=integer, 
//		which is resolved when compound operator is used
		b+=10;
		System.out.println(b);
		
	}

}
