package PW_Skills_Assignment.PW_Assignment_5;

import java.util.Scanner;

public class PW_Ass_5_QST_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int num= sc.nextInt();
        int ans=1;

        for(int i=1;i<=num;i++)
        {
            ans=ans*i;
        }
        System.out.println(ans);

    }
}
