package assignment_1;
import java.util.Scanner;
public class Prime_number {
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
				Scanner ob=new Scanner(System.in);
				int low=ob.nextInt();
				int high=ob.nextInt();
				prime(low,high);
			}
		}
