/*Q2 - Write a program to enter the numbers till the user wants, the number can be positive,
        negative or zero. Calculate the sum of numbers until a negative number is encountered.
        If the input is a negative number, current sum is discarded and print -1.*/

package PW_Skills_Assignment.PW_Assignment_5;

import java.util.Scanner;

public class PW_Ass_5_QST_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum = 0;

        while(sc.hasNextInt())
        {
            int num= sc.nextInt();
            if (num>0)
            {
                sum=sum+num;
            }
            else
            {
                sum = -1;
                break;
            }

        }
        System.out.println(sum);





    }
}
