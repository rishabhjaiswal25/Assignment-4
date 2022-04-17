import java.util.Scanner;
class OddEvenSum
{
	public void oddSum(n)
	{
		int s1 = 0;
		for(int i=0;i<=n;i++)
		{
			if(i%2 == 1)
			{
				s1 += i;
				System.out.println("Sum of all odd numbers between 1 to "+n" : ");
			}
		}
	}
	public void evenSum(n)
	{
		int s2 = 0;
		for(int j=0;j<=n;j++)
		{
			if(i%2==0)
			{
				s2+=j;
				System.out.println("Sum of all even numbers between 1 to "+n" :");
			}
		}
	}
	public static void main(String args[])
	{
		int diff = 0;

		OddEvenSum oe = new OddEvenSum(n);
		oe.oddSum(1000);
		oe.evenSum(1000);
		
		int a  = oe.s1;
		int b = oe.s2;
		
		diff = a-b;
		
		System.out.println("Absolute Difference between the two sums is "+diff);
	}
}
	
	