package assignment4;

import java.util.Scanner;

public class highest_placement 
{
	public static void main(String[] args)
	{
		Scanner sys=new Scanner(System.in);
		System.out.println("Enter the no. of students placed in CS: ");
		int cs=sys.nextInt();
		System.out.println("Enter the no. of students placed in EC: ");
		int ec=sys.nextInt();
		System.out.println("Enter the no. of students placed in ME: ");
		int me=sys.nextInt();
		
		if(cs==ec && ec==me)
		{
			System.out.println("None of the department has got the highest placement");
		}
		else
		{
			int max=0;
			if(cs>ec && cs>me)
			{
				max=cs;
				System.out.println("CS");
			}
			else if(ec>cs && ec>me)
			{
				max=ec;
				System.out.println("EC");
			}
			else
			{
				max=me;
				System.out.println("ME");
			}
			System.out.println("Highest Placement");
		}	
	}
	
	public static int max_placement(int cs, int ec, int me )
	{
		if(cs<0 && ec<0 && me<0)
		{
			System.out.println("Input is invalid");
		}
	}
	
	
}
