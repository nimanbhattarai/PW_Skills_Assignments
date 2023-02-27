package PW_Skills_Assignment.PW_Assignment_5;

import java.util.Scanner;

public class PW_Ass_5_QST_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=0;
        int digit=0;
        int sum=0;
        int num=sc.nextInt();
        int temp=num;

        while(temp>0)
        {
            l++;
            temp/=10;
        }
        temp=num;
        while (temp>0)
        {
            digit=temp%10;
            sum=sum+(int)Math.pow(digit,l);
            temp/=10;
        }
        if(sum==num)
        {
            System.out.println("Amg");
        }
        else
        {
            System.out.println("not");
        }
    }
}
