package AnimalSound;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalSound an;
		an = new Cat();
		System.out.println(an.sound());
		an = new Dog();
		System.out.println(an.sound());
	}

}
