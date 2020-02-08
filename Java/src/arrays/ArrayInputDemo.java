package arrays;

import java.util.Scanner;

public class ArrayInputDemo {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i<n; i++) {
			System.out.print("Enter element at" + i + ":");
			arr[i] = s.nextInt();
		}
		
		for (int i : arr) {
			
			System.out.println(i);
		}
	}
	
	

}
