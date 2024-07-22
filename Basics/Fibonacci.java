import java.util.*;
class Fibonacci
{
	public static void main(String... S)
	{
		int a=0,b=1,c;
		Scanner s=new Scanner(System.in);
		System.out.print("Please enter the First integer :");
	    int n=s.nextInt();
		
		for(int i=0; i<=n; i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}
}

































