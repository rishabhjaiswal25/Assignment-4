package assignment_4;
import java.util.Scanner;
public class Rohit_assignment_4_4 {


static void sum(int a,int b) {
	int even=0,odd=0,diff=0;
	for(int i=a;i<=b;i++) {
		if(i%2==0) {even=even+i;}
		else {odd=odd+i;}
	}
	diff=Math.abs(even-odd);
	System.out.println("The Sum of odd numbers from "+a+" to "+b+" is : " +odd);
	System.out.println("The Sum of even numbers from "+a+" to "+b+" is : " +even);
	System.out.println("The absolute difference between the two sums is : "+ diff);
	}
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter first number:");
	int low=s.nextInt();
	System.out.println("Enter second number");
	int high=s.nextInt();
	sum(low,high);
	}

}
