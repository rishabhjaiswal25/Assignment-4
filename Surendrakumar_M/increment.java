package Assignment4;
import java.util.*;
public class increment {
	public static double incre(double salar,float apra) {
		if(apra>=1 && apra<=4) {
			salar=salar*1.1;
		}
		else if (apra>=4.1 && apra<=7) {
			salar=salar*1.25;
		}
		else if(apra >=7.1 && apra<=10) {
			salar=salar*1.3;
		}
		return salar;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary ");
		double sal=sc.nextDouble();
		System.out.println("Enter the appraisal rating ");
		float apr=sc.nextFloat();
		if(apr<1 || sal<=0) {
			System.out.println("Invalid Input");
		}
		else {
			double res=incre(sal,apr);
			System.out.println("Salary: "+res);
		}
	}

}