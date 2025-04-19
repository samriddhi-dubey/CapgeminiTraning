package lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDriver {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(2, "A"));
		l.add(new Employee(1, "E"));
		l.add(new Employee(6, "C"));
		l.add(new Employee(4, "Y"));
  Collections.sort(l);
       System.out.println(l);
       
	}
}
