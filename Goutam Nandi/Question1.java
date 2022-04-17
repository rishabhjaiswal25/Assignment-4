package assignment_4;
import java.util.*;
class Question1 {
	
	 static void salary() {

        

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the salary");

        int salary = sc.nextInt();

        System.out.println("Enter the Performance appraisal rating");

        float rating = sc.nextFloat();

        if(salary<1||rating<1.0||rating>5.0){

            System.out.println("Invalid Input");

            System.exit(0);

        }

        else if(rating>=1&&rating<=3){

            salary=salary+(int)(0.1*salary);

            System.out.println(salary);

        }

        else if(rating>3&&rating<=4){

            salary=salary+(int)(0.25*salary);

            System.out.println(salary);

        }

        else {

            salary=salary+(int)(0.3*salary);

            System.out.println(salary);

        }

    } public static void main(String[] args) {
    salary();}

}
