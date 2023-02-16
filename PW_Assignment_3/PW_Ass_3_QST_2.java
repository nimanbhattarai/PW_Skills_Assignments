/*Q2 - Swap two numbers without the use of third variable.*/

package PW_Skills_Assignment.PW_Assignment_3;

import java.util.Scanner;

public class PW_Ass_3_QST_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The First Number is: ");
        int a=sc.nextInt();
        System.out.println("The Second Number is: ");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The First Number after swap: "+a);
        System.out.println("The Second Number after swap: "+b);


    }
}
