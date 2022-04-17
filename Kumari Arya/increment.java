package assignment4;

import java.util.Scanner;

public class increment 
{
	public static int sal_increment(int sal, float rating)
    {
        if(rating>=1 && rating<=4)
        {
            sal = sal+((sal*10)/100);
        }
        else if(rating>=4.1 && rating<=7)
        {
            sal = sal+((sal*25)/100);
        }
        else if(rating>=7.1 && rating<=10)
        {
            sal = sal +((sal*30)/100);
        }
        return sal;
        //System.out.println("Increment salary:"+sal);
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the salary: ");
	    int sal = sc.nextInt();
	     
	    System.out.println("Enter the Performance appraisal rating: ");
	    float rating = sc.nextFloat();
	 
        
        if(rating<1 || rating>10 || sal<0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
        	System.out.println(sal_increment(sal,rating));
        }
    }

}
