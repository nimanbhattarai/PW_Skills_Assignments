package PW_Skills_Assignment.PW_Assignment_21;

import java.util.Scanner;

public class PW_Ass_21_QST_1 {
    static void printPattern(int n){
        if(n==0 || n < 0){
            System.out.println(n + " ");
            return;
        }

        //decreasing order
        System.out.println(n + " ");

        printPattern(n-5);

        //increasing order
        System.out.println(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n= sc.nextInt();

        printPattern(n);

    }
}

