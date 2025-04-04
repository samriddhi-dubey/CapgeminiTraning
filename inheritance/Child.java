package inheritance;

public class Child extends Parent {
	
    void display() {
		System.out.println(b);//non-static variables are inherited
		System.out.println(a);//static variables are inherited
		message(); //non-static meethods are inherited
		print(); //static methods are inherited
	}

}
