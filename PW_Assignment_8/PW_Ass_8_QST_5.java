// Q5 - Write a Java method to check whether a year (integer) entered by the user is a leap year or not.

package PW_Skills_Assignment.PW_Assignment_8;

import java.util.Scanner;

public class PW_Ass_8_QST_5 {

    static class date{

        public static boolean leap_year(int y){
            boolean a=(y % 4) == 0;
            boolean b=(y % 100)!= 0;
            boolean c=((y % 100)==0 && (y % 400)==0);
            return a || b && c;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the leap year: ");
        int year= sc.nextInt();
        System.out.println(date.leap_year(year));
    }
}
