//Order of execution is important

package static_and_non_static;

public class Demo {
	static {
		System.out.println("First multiline static initializers");
	}
	static {
		System.out.println("Second multiline static initializers");
	}
	static {
		System.out.println("Third multiline static initializers");
	}

	public Demo() {
		System.out.println("Constructor");
	}

	{
		System.out.println("1 Non-Static Initializer");
	}
	{
		System.out.println("2 Non-Static Initializer");
	}

	public static void main(String[] args) {
		System.out.println("main");
		Demo d = new Demo();
		Demo d1 = new Demo();
	}

}
