package day8;

public class EmployeeDriver {
	
  public static void main(String[] args) {
	Employee obj1=new Employee();
	
	Employee obj2=new Employee(1);
	System.out.println("ID:"+ obj2.id);
	
	Employee obj3=new Employee(2, "Samriddhi");
	System.out.println("ID:"+ obj3.id + " Name:"+ obj3.name);
	
	Employee obj4=new Employee(3, "Karan", 296369.56);
	System.out.println("ID:"+ obj4.id + " Name:"+ obj4.name+" Salary:" + obj4.salary);
	
	Employee obj5= new Employee(3, "Kiara", 296369.56, "Capgemini");
	System.out.println("ID:"+ obj5.id + " Name:" + obj5.name+" Salary:" + obj5.salary+ " Company:"+obj5.companyName);
}   
}   
   

