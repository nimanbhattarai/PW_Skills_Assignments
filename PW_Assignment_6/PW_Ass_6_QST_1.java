package PW_Skills_Assignment.PW_Assignment_6;

import java.util.Scanner;

public class PW_Ass_6_QST_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int decimal_no= sc.nextInt();

        int ans=0;
        int pw=1;

        while(decimal_no>0)
        {
            int parity=decimal_no % 2;
            ans += (parity * pw);
            pw *= 10;
            decimal_no /= 2;
        }
        System.out.println(ans);
    }
}
