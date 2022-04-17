package assignment_4;
import java.util.*;
public class Question1 {
	
	static int salary(int sal,float r) 
	{
		int new_sal=0,increment=0;
		if (r>=1 && r<=4)
		{
			increment=10;
		}
		
		else if (r>=4.1 && r<=7)
		{
			increment=25;
		}
		
		else
		{
			increment=30;
		}
		new_sal=sal+(sal*(increment/100));
		return new_sal;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the Salary: ");
		Scanner sc=new Scanner(System.in);
		int sal=sc.nextInt();
		System.out.println("enter the apprisal rating: ");
		float r=sc.nextFloat();
		if(sal<=0 || r<1.0 ||r>10)
		{
			System.out.println("Invalid Input..");
			System.exit(0);
		}
		else{
			 System.out.println(salary(sal,r));
		}
	}

}
