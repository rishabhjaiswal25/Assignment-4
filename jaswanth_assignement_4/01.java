import java.util.Scanner;
public class Main {

	static int salary_increment(int salary,float rating) {
		int inc=0;
		if(rating >=1 && rating <= 4) {
			inc=10;
		}
		else if(rating >= 4.1 && rating <=7) {
			inc=25;
		}
		else {
			inc=30;
		}
		int inc_salary=salary+(salary*inc/100);
		return inc_salary;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the salary: ");
		int salary=s.nextInt();
		System.out.println("Enter the Performance appraisal rating: ");
		float rating= s.nextFloat();
		if(rating<1 || rating>10 || salary<0) {
			System.out.println("Invalid Input");
		}else {
			System.out.println(salary_increment(salary,rating));
		}
		
	}
}
