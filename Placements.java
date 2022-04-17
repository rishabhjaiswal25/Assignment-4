package assignment_4;

import java.util.Scanner;

public class Placements {
	public static void placed(int cs,int ec,int me) {
		if(cs>ec && cs>me) {
			System.out.println("Highest placement CS");
		}
		else if(ec>cs && ec>me) {
			System.out.println("Highest placement EC");
			
		}
		else if(me>cs && ec<me) {
			System.out.println("Highest placement ME");
		}
		else if(ec==cs && ec<me) {
			System.out.println("Highest placement EC CS");
		}
		else if(ec==me && ec>cs) {
			System.out.println("Highest placement EC ME");
		}
		else if(me==cs && me>ec) {
			System.out.println("Highest placement ME CS");
		}
		else {
			System.out.println("None of the department has got the highest placement");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students placed in CS: ");
		int cs=sc.nextInt();
		System.out.println("Enter the number of students placed in EC : ");
		int ec=sc.nextInt();
		System.out.println("Enter the number of students placed in ME : ");
		int me = sc.nextInt();
		if(cs>=0 && ec>=0 && me>=0) {
			placed(cs,ec,me);
		}
		else {
			System.out.print("Input is invalid");
		}
		
		

	}

}
