package hashSet_Collections;

import java.util.HashSet;

public class HashSetMethods {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(10);
		set.add(52);
		set.add("Sam");
		set.add(null);
		set.add(85);
		set.add(-96);
		set.add(0);
		set.add(56.3);
		System.out.println(set.size());
		
		System.out.println(set);
	}

}
