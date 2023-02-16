/*Q3 - Write a program to calculate the sum of the digits of a 3-digit number.*/


package PW_Skills_Assignment.PW_Assignment_3;

import java.util.Scanner;

public class PW_Ass_3_QST_3 {

    public static void main(String[] args) {

        int num,digit,sum=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the digit: ");
        num = sc.nextInt();

        while(num>0){

            digit= num%10;
            sum=sum+digit;
            num=num/10;

        }
        System.out.println("The sum of 3-digit number is: "+sum);


    }
}
