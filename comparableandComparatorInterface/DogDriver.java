package comparableandComparatorInterface;

import java.util.Arrays;

public class DogDriver {
	
	public static void main(String[] args) {
		Dog arr[]=new Dog[3];
		Dog d1=new Dog("r",2,"a");
		Dog d2=new Dog("r",2,"c");
		Dog d3=new Dog("r",2,"b");
		
		arr[0]=d1;
		arr[1]=d2;
		arr[2]=d3;
		
		Arrays.sort(arr,new CompareByBreed());
		
		
		
		for(Dog dogs: arr) {
			System.out.println(dogs);
		}
	}

}
