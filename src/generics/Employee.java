package generics;

public class Employee <T,K> {
	T data1;
	K data2;
	
	Employee(T data1,K data2){
		this.data1=data1;
		this.data2=data2;
	}
	
	public String toString() {
		return data1+"	"+data2;
	}
	
	public static void main(String[] args) {
		Employee<Integer,String> e1=new Employee<Integer,String>(10,"hello");
		System.out.println(e1);
		System.out.println(e1.data1 instanceof Integer);
		
//		Employee<String> s2= new Employee<String>("hello","world");
		
		
		
	}
}
