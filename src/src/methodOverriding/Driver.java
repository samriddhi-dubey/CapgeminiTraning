package methodOverriding;

public class Driver {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		Tiger tiger = new Tiger();
		tiger.sound();
	}

}
