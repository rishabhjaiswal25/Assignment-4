import java.util.*;
public class main {
    static void method() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Provide first number of range ");

        int a=sc.nextInt();
        System.out.println("Provide last number of range ");
        int b=sc.nextInt();
        int flag;
        if(a<=0 || b<=0 || a>=b)

            System.out.println("Provide valid input");
        else
        {
            Inner:
            while(a<=b)
            {
                if(a==2)
                    System.out.print(a+" ");
                else if(a==1)
                {
                    a++;
                    continue;
                }
                else
                {
                    flag=0;
                    outer:
                    for(int i=2;i<=a/2;i++)
                    {
                        if(a%i==0)
                        {
                            flag=1;
                            break outer;
                        }
                    }
                    if(flag==0)
                        System.out.print(a+" ");
                }
                a++;
            }
        }
    }public static void main(String[] args) {
        method();}
}

