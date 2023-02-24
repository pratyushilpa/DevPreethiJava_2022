package pack.abstrac;

public class Rectangle extends Figure{
	Figure fig; // no error 
	public Rectangle(double a , double b) {
		super(a , b);
	}
	@Override
	void area() {
		System.out.println("Area of Rectangle is : " + (dim1 * dim2));
	}
	public static void main(String[] args) {
		Figure fig = new Rectangle(10,4.5); // upcasting - subclasses new instance is refrenced by Super class
		Rectangle r = new Rectangle(20, 5.5);
		r.area();
		Figure f = r;
		f.area();
		
		
	}
}
