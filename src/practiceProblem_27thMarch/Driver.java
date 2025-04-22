package practiceProblem_27thMarch;

public class Driver {
	public static void main(String[] args) {
		FullTimeEmployee f=new FullTimeEmployee("Samriddhi",2600000,1200);
		f.fullTimeEmployeeInfo();
		f.employeeInfo();
		PartTimeEmployee p=new PartTimeEmployee("Om",10000000,26);
		p.employeeInfo();
		p.partTimeEmployeeInfo();
	}

}
