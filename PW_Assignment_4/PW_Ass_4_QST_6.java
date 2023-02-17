/*Q6 - Write a program to calculate marks to grades . Follow the conversion rule as given below :
100-90->A+
90-80->A
80-70->B+
70-60->B
60-50->C
50-40->D
40-30->E
30-0->F
 */

package PW_Skills_Assignment.PW_Assignment_4;

import java.util.Scanner;

public class PW_Ass_4_QST_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks=sc.nextInt();

        if(marks>=90)
        {
            System.out.println("The Grade is A+");
        }
        else if(marks>=80)
        {
            System.out.println("The Grade is A");
        }
        else if(marks>=70)
        {
            System.out.println("The Grade is B+");
        }
        else if(marks>=60)
        {
            System.out.println("The Grade is B");
        }
        else if(marks>=50)
        {
            System.out.println("The Grade is C");
        }
        else if(marks>=40)
        {
            System.out.println("The Grade is D");
        }
        else if(marks>=30)
        {
            System.out.println("The Grade is E");
        }
        else if(marks>=0)
        {
            System.out.println("The Grade is F");
        }
        else
        {
            System.out.println("Enter the valid marks");
        }


    }
}
