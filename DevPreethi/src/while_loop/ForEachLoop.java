package while_loop;

public class ForEachLoop {

	public static void main(String[] args) {
		int [] arr = {10,20,30,50,60};
		for(int x : arr){
		System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("--------------------");
		for(int i =0 ; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
