package PW_Skills_Assignment.PW_Assignment_6;

import java.util.Scanner;

public class PW_Ass_6_QST_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Decimal Number: ");
        int decimal_no= sc.nextInt();
        System.out.print("Enter the Binary number: ");
        int binary_no= sc.nextInt();

        int ans =0;
        int pw=1;

        while(binary_no!=0)
        {
            int rem=(binary_no % 2);
            ans += rem * pw;
            pw *= 2;
            binary_no /= 10;
        }
        System.out.println(decimal_no + ans);

    }
}
