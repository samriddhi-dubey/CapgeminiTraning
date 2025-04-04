package stringBuffer;

public class Demo {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append(102);
		sb1.append(true);
		sb1.append("Hello");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("Hello World");
		System.out.println(sb2);
		//delete a substring in the main string
		sb2.delete(0, 5);
		System.out.println(sb2);
		//insert at particular index
		sb2.insert(1, false);
		System.out.println(sb2);
		//replace a character
		sb2.setCharAt(4, '%');
		System.out.println(sb2);
		
		char[] arr = {'a', '@', '-', 'z'};
		//capacity mentioned
		StringBuffer sb3 = new StringBuffer(150);
		sb3.append(arr);
		//insert a character array
		sb3.insert(2, arr, 1, 2);
		System.out.println(sb3);
		//initial capacity = 16
		System.out.println(sb3.capacity()); 
		
		//capacity set (initial*2)+2
		sb3.ensureCapacity(160);
		System.out.println(sb3.capacity());
		
		//reverse 
		System.out.println(sb3.reverse());
		
		//convert to string
		String s = new String(sb3);
		System.out.println(s);
	}
}
