//Q1 - Write a program to print Fibonacci series of n terms where n is input by user.

package PW_Skills_Assignment.PW_Assignment_5;

import java.util.Scanner;

public class PW_Ass_5_QST_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int a= 1;
        int b=1;

        for(int i=1;i<=num;i++)
        {
            System.out.print(a + " ");
            int add = a + b;
            a = b;
            b = add;
        }

    }
}
