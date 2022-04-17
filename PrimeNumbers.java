import java.util.Scanner;
public class PrimeNumbers
{
	public static void main (String[]args)
	{
		for (int i = lower; i <= upper; i++)
		if (isPrime (i))
		{
			System.out.println (i);
		}
		static boolean isPrime (int n)
		{
			int count = 0;
			if (n < 2)
			{
				return false;
     			}
			for (int i = 2; i < Math.sqrt (n); i++)
       			{
 				if (n % i == 0)
				{
 					return false;
       				}
     		return true;
   	}		
 }