package arrays;
import java.util.Scanner;

public class GreatestNumber {
	
	public static void main(String[] args) {
	       int a,b,c;
	       Scanner s = new Scanner(System.in);

	        System.out.println("enter first number:");
	        a= s.nextInt();
	        System.out.println("enter second number:");
	        b=s.nextInt();
	        System.out.println("enter third number:");
	        c=s.nextInt();
	        if(a>b && a>c) {
	            System.out.println("greatest number is a");
	        }
	        else if(b>a && b>c) {
	            System.out.println("greatest number is b");
	        }
	        else {
	            System.out.println("greatest number is c");
	        }


	    }

}
