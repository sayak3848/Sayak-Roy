package arrays;

import java.util.Scanner;

public class SmallestNumber {
	
	 public static void main(String[] args) {
	        int a,smallest;
	        Scanner s = new Scanner(System.in);
	        System.out.println("enter number of elements");

	         a = s.nextInt();

	        int arr[] = new int[a];


	        for (int i = 0; i < a; i++) {
	            System.out.print("enter elements: ");
	            arr[i] = s.nextInt();

	        }
	        smallest=arr[0];
	        for(int i=0;i<a;i++){
	            if(smallest>arr[i]) {
	                smallest=arr[i];
	            }
	            System.out.println("smallest number is:"+smallest);
	        }
	    }

}
