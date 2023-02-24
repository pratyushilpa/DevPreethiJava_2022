package oops;
// POJO class
public class Encap {
	private int num ;
	private double d;
	private String name;
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null) {
			name = "Hello";
			// Faker which will be used to generate random string
		}
		this.name = name;
	}
	// getters and Setters methods
	public int getNum(){
	return num;
	}
	public void setNum(int a){
		if(a==0) {
			a = 10;
			// a = Math.random(3);
		}
	this.num = a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap en = new Encap();
		en.setNum(1000);
		System.out.println(en.getNum());
		en.setNum(0);
		System.out.println(en.getNum());
	}

}
