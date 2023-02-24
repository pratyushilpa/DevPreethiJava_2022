package oops;

public class Tiger extends Mamals{
	public static void main(String[] args) {
		Mamals m = new Tiger();
		m.eat();
		m.sleep();
	}
	@Override
	void eat() {
		System.out.println("Tiger - eating");
	}
	@Override
	void sleep() {
		System.err.println("Tiger - sleeping");
	}

}
