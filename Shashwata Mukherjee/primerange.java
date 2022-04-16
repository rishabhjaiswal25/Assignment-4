package Assignment4;
import java.util.*;
public class primerange {
	public static void primeprint(int a,int b) {
		int i,flag,j;
		for(i=a;i<=b;i++) {
			if(i==2) {
				System.out.print(2+" ");
			}
			else {
				if(i%2!=0 && i!=1) {
					flag=0;
					for(j=2;j<i/2;j++) {
						if(i%j==0) {
							flag=1;
						}
					}
					if(flag==0) {
						System.out.print(i+" ");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>0 && b>0 && a<b) {
			primeprint(a,b);
		}
		else {
			System.out.println("Provide valid input ");
		}

	}

}
