package assignment_4;

import java.util.Scanner;

public class Salary {
	
	public static double increment(double salary,float apr) {
		double incrementedSal = 0;
		if(apr>=1 && apr<=4) {
			incrementedSal = salary * 0.1;
		}
		else if(apr>=4.1 && apr<=7) {
			incrementedSal = salary*0.25;
		}
		else if(apr>7.1 && apr<=10) {
			incrementedSal = salary*0.3;
		}
		return salary + incrementedSal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary:");
		double salary = sc.nextDouble();
		System.out.println("enter appraisal:");
		float apr = sc.nextFloat();
		if(apr<1 || salary==0) {
			System.out.println("invalid");
		}
		else {
			double res = increment(salary,apr);
			System.out.println("salary:"+(int)res);
			
		}
		
		
		
		

	}

}
