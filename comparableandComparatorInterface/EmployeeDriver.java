package comparableandComparatorInterface;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ram", 23662);
		Employee e2 = new Employee(2, "Ram", 30000);

		System.out.println(e1.toString());
		System.out.println(e2.toString());

		System.out.println("------------------------------------");

		compareBasedOnName(e1,e2);
		
		System.out.println("------------------------------------");
		compareBasedOnID(e1,e2);
		
		System.out.println("------------------------------------");
		compareBasedOnSalary(e1,e2);
		
	}
	
	private static void compareBasedOnSalary(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		
		CompareBasedOnSalary compareSalary=new CompareBasedOnSalary();
		if (compareSalary.compare(e1, e2) > 0) {
			System.out.println("e1 is greater");
		} else if (compareSalary.compare(e1, e2) < 0) {
			System.out.println("e2 is greater");
		} else {
			System.out.println("e1 and e2 are same");
		}
		
		
	}

	public static void compareBasedOnName(Employee e1, Employee e2) {
		if (e1.compareTo(e2) > 0) {
			System.out.println("e1 is greater");
		} else if (e1.compareTo(e2) < 0) {
			System.out.println("e2 is greater");
		} else {
			System.out.println("e1 and e2 are same");
		}
		
	}
	
	public static void compareBasedOnID(Employee e1, Employee e2) {
		
		CompareEmployeeByID compareId=new CompareEmployeeByID();
		
		if (compareId.compare(e1, e2) > 0) {
			System.out.println("e1 is greater");
		} else if (compareId.compare(e1, e2) < 0) {
			System.out.println("e2 is greater");
		} else {
			System.out.println("e1 and e2 are same");
		}
		
	}

}
