/*Q4 - Write a program to print positive number entered by the user, if user enters a negative
        number, it is skipped*/

package PW_Skills_Assignment.PW_Assignment_4;

import java.util.Scanner;

public class PW_Ass_4_QST_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num= sc.nextInt();

        if(num>+1)
        {
            System.out.println("The number is Positive");
        }
        else
        {
            System.out.println("The number is Negative so it is skipped");
        }


    }
}
