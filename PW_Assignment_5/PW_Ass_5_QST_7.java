package PW_Skills_Assignment.PW_Assignment_5;

import java.util.Scanner;

public class PW_Ass_5_QST_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<=a;j++)
            {
                if(i == a/2)
                {
                    System.out.print("*");
                }
                else
                {
                    if(j == a/2)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
