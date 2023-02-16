package PW_Skills_Assignment;

import java.util.Scanner;

public class PW_Ass_2_QST_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of cases: ");
        int t=sc.nextInt();

        for(int i=1;i<=t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a+b);

        }

    }
}
