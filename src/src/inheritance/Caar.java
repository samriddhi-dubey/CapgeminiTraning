package inheritance;

public class Caar extends Vehiclee {
	
	int hp;
	public Caar(String name, String engineType, int hp) {
		super(name, engineType);
		this.hp=hp;
		System.out.println("Child");
		
	}
	

}
