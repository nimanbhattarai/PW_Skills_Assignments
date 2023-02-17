/*Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
        calculate Profit or Loss.*/

package PW_Skills_Assignment.PW_Assignment_4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PW_Ass_4_QST_3 {
    public static void main(String[] args) {
        int Profit,Loss;
        Scanner sc=new Scanner(System.in);

        System.out.print("The CP is: ");
        int CP=sc.nextInt();

        System.out.print("The SP is: ");
        int SP=sc.nextInt();

        if(SP>CP)
        {
            Profit = SP - CP;
            System.out.println("This is Profit and the Profit is: " + Profit);
        }
        else
        {
            Loss = CP - SP;
            System.out.println("This is Loss and the Loss is: "+Loss);
        }


    }
}
