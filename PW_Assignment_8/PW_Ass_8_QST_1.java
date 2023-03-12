// Q1 - Write a Java method to compute the average of three numbers.

package PW_Skills_Assignment.PW_Assignment_8;

import java.util.Scanner;
 class Average{

    int avg(int a,int b,int c){
        int ans = (a+b+c)/3;
        return ans;
    }
}
public class PW_Ass_8_QST_1 {

    public static void main(String[] args) {
        Average obj=new Average();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a= sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int b=sc.nextInt();

        System.out.print("Enter 3rd Number: ");
        int c=sc.nextInt();

        System.out.print("The Average of three number is: ");
        int ans=obj.avg(a,b,c);
        System.out.println(ans);

    }
}
