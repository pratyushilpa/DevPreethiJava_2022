package arrays_programs;
import java.util.Scanner;
public class SearchingInArray {
	
	public static void searchInArray(int[] input , int num) {
		//int size = input.length;
		for(int ele : input) {
			if(ele==num) {
				System.out.println("Element found " + ele);
				//break;
				return;
			}
		}
		System.out.println("Element not found ");
	}

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50,70,80,100,90,60};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in the multiple of 10");
		int num = sc.nextInt();
		searchInArray(arr , num);
	}

}
