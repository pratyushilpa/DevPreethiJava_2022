package oops;

public class Human extends Mamals{

	public static void main(String[] args) {
		//Mamals m = new Mamals();
		Mamals m = new Human();
		m.eat();
		m.sleep();
	}
	@Override
	void eat() {
		System.out.println("Human-eating");
		
	}
	@Override
	void sleep() {
		System.out.println("Human-sleeping");
	}
}
