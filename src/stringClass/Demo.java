package stringClass;

public class Demo {
	public static void main(String[] args) {
//		String s1 = "Hello";
//		String s2 = new String("Hello");
//		char[] arr = {'j', 'a', 'v', 'a'};
//		String s3 = new String(arr);
//		System.out.println(s1+" "+s2+" "+s3);
		
		//charAt method
		String s = "Hello";
		System.out.println(s.charAt(0));
		
		//codePointAt method
		System.out.println(s.codePointAt(1));
		
		//concat method
		s = s.concat("World");
		System.out.println(s);
		
		//contains method
		System.out.println(s.contains("World"));
		
		//contentEquals method 
		System.out.println(s.contains("hello"));
		
		//length
		System.out.println(s.length());
		String str = "";
		System.out.println(str.length());
		
		//isEmpty
		System.out.println(str.isEmpty());
		
		//isBlank
		String s1 = " ";
		System.out.println(s1.isBlank());
		System.out.println(str.isBlank());
		System.out.println(s.isBlank());
		
		//startsWith
		System.out.println(s.startsWith("h"));
		
		//indexOf
		System.out.println(s.indexOf('e'));
		
		//lastindexOf
		System.out.println(s.lastIndexOf('l'));
		
		//endsWith
		System.out.println(s.endsWith("d"));
		
		//join
		System.out.println(String.join("?", "Hello", "world", "good", "evening"));
		
		//replace
		System.out.println(s.replace("World", "earth"));
		
		//replaceFirst
		System.out.println(s.replaceFirst(str, s1));
		
		//split
		String[] arr1 = s.split("");
		System.out.println(arr1);
		
		//toCharArray
		char[] arr2 = s.toCharArray();
		System.out.println(arr2);
		
		//trim
		String s2 = "             hello        bye";
		System.out.println(s2);
		System.out.println(s2.trim());
		
		//substring
		String s3 = "Hello world";
		System.out.println(s3.substring(3));
		System.out.println(s3.substring(0,6));
	}
}
