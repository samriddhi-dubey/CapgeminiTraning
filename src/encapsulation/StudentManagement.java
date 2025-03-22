package encapsulation;

public class StudentManagement {
	private String password="sam@2203";
	private String name="Samriddhi";
	private String email="samriddhidubey798@gmail.com";
	private int age=23;
	private String gender="female";
	private String branch="CSE";
	
	
	
	public void getEmail(String password) {
		if(this.password==password) {
			System.out.println(email);
		}else {
			System.out.println("Invalid password");
		}
		
	}
	
	public void setPassword(String password, String newPassword) {
		if(this.password == password) {
			password=newPassword;
			System.out.println("Password successfully changed");
		}else {
			System.out.println("Invalid password");
		}
	}
	public void getName(String password) {
		if(this.password==password) {
			System.out.println(name);
		}else {
			System.out.println("Invalid password");
		}
	}
	
	public void getAge(String password) {
		if(this.password==password) {
			System.out.println(age);
		}else {
			System.out.println("Invalid password");
		}
	}
	
	public void getGender(String password) {
		if(this.password==password) {
			System.out.println(gender);
		}else {
			System.out.println("Invalid password");
		}
	}
	
	public void getBranch(String password) {
		if(this.password==password) {
			System.out.println(branch);
		}else {
			System.out.println("Invalid password");
		}
	}
	
	public void getDetails(String name) {
		if(this.name==name) {
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			System.out.println(email);
			System.out.println(branch);
		}
	}
	
	

}
