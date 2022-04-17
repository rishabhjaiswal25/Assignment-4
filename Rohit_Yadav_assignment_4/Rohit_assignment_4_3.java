package assignment_4;
import java.util.Scanner;
public class Rohit_assignment_4_3 {
	static void prime(int low,int high) {
		if(low>=high) {
			System.out.println("Provide valid input");
		}
		else {
			if(low==1) {low++;}
			for(int i=low;i<=high;i++) {
				int count=0;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {count++;}
				}
				if(count==0) {System.out.print(i+" ");}
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int low=sc.nextInt();
		System.out.println("Enter second number");
		int high=sc.nextInt();
		prime(low,high);
	}
}

