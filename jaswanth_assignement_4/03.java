import java.util.Scanner;
public class Main {
	static void prime(int x,int y) {
		if(x>=y) {
			System.out.println("Provide valid input");
		}
		else {
			if(x==1) {x++;}
			for(int i=x;i<=y;i++) {
				int count=0;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {count++;}
				}
				if(count==0) {System.out.print(i+" ");}
			}
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		prime(x,y);
	}
}
