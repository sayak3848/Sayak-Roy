import com.sun.tools.javac.parser.Scanner;

class ReverseRecursion
{
	int res=0;	
	void reverse(int num)
	{
	int rem;
	if(num!=0)
	{
	rem=num%10;
	res=(res*10)+rem;
	num=num/10;
	reverse(num);
	}
	else
	System.out.println("reverse of a number is "
 
"+res);"
 
	}
 
public static void main(String[] arg)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int x=sc.nextInt();
	Rev r=new Rev();
	r.reverse(x);
	}
}