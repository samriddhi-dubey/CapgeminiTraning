package inheritance;

public class SubClass extends Super {
	double a=2.5;
	static int b=6;
	
	public void print() {
		System.out.println(super.a);
		System.out.println(a);
		System.out.println(Super.b);
		System.out.println(b);
	}

}
