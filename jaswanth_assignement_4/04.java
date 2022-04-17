import java.util.Scanner;
import java.lang.Math;
public class Main {

	static void sum(int x,int y) {
		int even=0,odd=0,abs=0;
		for(int i=x;i<=y;i++) {
			if(i%2==0) {even=even+i;}
			else {odd=odd+i;}
		}
		abs=Math.abs(even-odd);
		System.out.println("The Sum of odd numbers from "+x+" to "+y+" is:"+odd);
		System.out.println("The Sum of even numbers from "+x+" to "+y+" is:"+even);
		System.out.println("The absolute difference between the two sums is: "+abs);
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		sum(x,y);
	}

}
