import java.util.Scanner;
public class Question4
{

 static void addition()
  {int flag=0;
  int fight=0;
    Scanner a = new Scanner (System.in);

      System.out.println ("Enter the lowerbound");

          int l = a.nextInt ();
 System.out.println ("Enter the upperbound");

          int u = a.nextInt ();
          for(int k=l;k<=u;k++)
          {
              if(k%2==0){
                  flag =flag+k;
                  
              }
              else{
                  fight=fight+k;
                  
              }
          }int g=flag - fight;
           System.out.println ("addition of even number from "+l+" and "+u+" is "+flag);
           System.out.println ("addition of even number from "+l+" and "+u+" is "+fight);
           System.out.println ("absolute difference is "+g);
           

  }
  public static void main(String[] args) {
    addition();
  
  }

}
