/*Q1 - Write a program which takes the values of length and breadth from user and check if it is
        a square or not.*/

package PW_Skills_Assignment.PW_Assignment_4;

import java.util.Scanner;

public class PW_Ass_4_QST_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("The length is: ");
        int length=sc.nextInt();

        System.out.print("The bredth is: ");
        int bredth= sc.nextInt();

        if(length==bredth)
        {
            System.out.println("It is square");
        }
        else
        {
            System.out.println("It is not Square");
        }
    }
}
