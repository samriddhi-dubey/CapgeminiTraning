package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		TreeSet<Employee> tree=new TreeSet<Employee>(new CompareEmployeeByName());
		
		tree.add(new Employee("Sam",20000));
		tree.add(new Employee("Ram",30000));
		
//		System.out.println(tree.descendingSet());
		
		Iterator<Employee> itr=tree.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
