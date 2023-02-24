package oops;
// order of statement 
// package -> import - > class
 class Box{
	int height;
	int width;
	int length;
	public Box() {
		height =10;
		width = 5 ;
		length =2;
	}
	public static int calculateVolume(int h , int w, int l) {
		return h *w*l;
	}
}
public class BoxDemo {
	public static void main(String[] args) {
		Box myBox = new Box();
		//myBox.height = 10 ;
		//myBox.width = 5 ;
		//myBox.length = 2;
		 int volume = myBox.calculateVolume(10, 5, 2);
		 System.out.println(volume);
		

	}

}
