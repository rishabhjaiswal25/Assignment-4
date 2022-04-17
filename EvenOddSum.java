package assignment_4;

import java.util.Scanner;
import java.lang.Math;
public class EvenOddSum {
	static void evenoddsum(int a,int b) {
		int  oddsum=0,evensum=0;
		int i,abs=0;
		for(i=a;i<b;i++) {
			if(i%2==0) {
				evensum+=i;
				
			}
			else {
				oddsum+=i;
			}
			
		}
		abs=Math.abs(evensum-oddsum);
		System.out.println("The sum of odd numbers from " +(a)+ " to " +(b)+ " is :" +oddsum);
		System.out.println("The sum of even numbers from " +(a)+ " to " +(b)+ " is :" +evensum);
		System.out.println("The absolute difference between the two sums is :"+abs);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.print("enter starting no");
		int a = sc.nextInt();
		//System.out.print("enter ending no");
		int b = sc.nextInt();
		evenoddsum(a,b);
		
		
	}

}
