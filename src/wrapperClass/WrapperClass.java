package wrapperClass;

public class WrapperClass {
	public static void main(String[] args) {
	  //boxing
		//depricated
		Integer i = new Integer(10);
		Character x = new Character('a');
		
		Double y = 123.5;
		System.out.println(y);
		
		//un-boxing
		int z = Integer.valueOf(20);
		System.out.println(z);
		Boolean flag = true;
		boolean b = flag.booleanValue();
		
		//auto-unboxing
		Character ch = 's';
		char c = ch;
		
		Integer k = 10;
		Integer j = 10;
		System.out.println(k==j);
		
		//parsing
		int v = Integer.parseInt("510");
		System.out.println(v);
	}
}
