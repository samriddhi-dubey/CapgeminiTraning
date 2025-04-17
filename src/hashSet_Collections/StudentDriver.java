package hashSet_Collections;

import java.util.HashSet;

public class StudentDriver {
	public static void main(String[] args) {
		HashSet<Student> set=new HashSet<Student>();
		set.add(new Student("Sam",1));
		set.add(new Student("Sam",2));
		set.add(new Student("Ram",3));
		set.add(new Student("Sam",3));
		set.add(new Student("Sam",1));
		set.add(new Student("Ram",1));
		
		System.out.println(set);
		
	}

}
