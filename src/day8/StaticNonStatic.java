package day8;

public class StaticNonStatic {
	public StaticNonStatic() {
		System.out.println(StaticandNonStaticVariables.name);
		StaticandNonStaticVariables obj=new StaticandNonStaticVariables();
		System.out.println(obj.id);
	}

	public static void main(String[] args) {
		
		StaticNonStatic obj=new StaticNonStatic();
		

	}

}
