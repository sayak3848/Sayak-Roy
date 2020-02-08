package arrays;

import java.util.Scanner;

public class GreatestNarray {
	
	public static void main(String[] args) {
        int a,greatest;
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of elements");

         a = s.nextInt();

        int arr[] = new int[a];


        for (int i = 0; i < a; i++) {
            System.out.print("enter elements: ");
            arr[i] = s.nextInt();

        }
        greatest=arr[0];
        for(int i=0;i<a;i++){
            if(greatest<arr[i]) {
                greatest=arr[i];
            }
            System.out.println("greatest number is:"+greatest);
        }
    }
}

}
