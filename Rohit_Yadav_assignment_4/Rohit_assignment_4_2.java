package assignment_4;
import java.util.Scanner;
public class Rohit_assignment_4_2 {
	public static void max(int cs,int ec,int me) {
		if(cs>ec && cs>me) {
			System.out.println("Highest Placement CS");
		}
		else if(ec>cs && ec>me) {
			System.out.println("Highest Placement EC");
		}
		else if(me>cs && ec<me) {
			System.out.println("Highest Placement ME");
		}
		else if(ec==cs && ec>me) {
			System.out.println("Highest Placement EC CS");
		}
		else if(ec==me && ec>cs) {
			System.out.println("Highest Placement EC ME");
		}
		else if(me==cs && me>ec) {
			System.out.println("Highest Placement ME CS");
		}
		else {
			System.out.println("None of the department has got the highest placement");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students placed in CS: ");
		int cs=sc.nextInt();
		System.out.println("Enter the no of students placed in EC: ");
		int ec=sc.nextInt();
		System.out.println("Enter the no of students placed in ME: ");
		int me=sc.nextInt();
		if(cs>=0 && ec>=0 && me>=0) {	
			max(cs,ec,me);
		}
		else {
			System.out.println("Invalid Input ");
		}
	}
}