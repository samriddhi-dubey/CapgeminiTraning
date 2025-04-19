package methodReferences;

public class MethodReferenceDriver {
	public static void main(String[] args) {
		Demo d = System.out::println;
		d.print("Hello World");
		System.out.println("------------------------------");
		MethodReferenceDriver driver=new MethodReferenceDriver();
		Test t= driver::print;
		t.greet("awesome", 5);
		System.out.println("------------------------------");
		Table tb=driver::printTable;
		tb.printTable(5);
	}
	
	public void print(String message,int n) {
		for(int i=0;i<n;i++) {
			System.out.println(message);
		}
	}
	
	public void printTable(int x) {
		for(int i=1;i<=10;i++) {
			System.out.println(i*x);
		}
	}

}
