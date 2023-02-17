/*Q2 - Write a program to print absolute value of a number entered by the user.*/

package PW_Skills_Assignment.PW_Assignment_4;

import java.util.Scanner;

public class PW_Ass_4_QST_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=sc.nextInt();

        if( num<0)
        {
            num=num*-1;
        }
        System.out.println("The absolute number is: "+num);

    }
}
