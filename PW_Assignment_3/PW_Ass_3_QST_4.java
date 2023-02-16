/*Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
        i) both the conditions 'a < 50' and 'a < b' are true.
        ii) at least one of the conditions 'a < 50' or 'a < b' is true.*/

package PW_Skills_Assignment.PW_Assignment_3;

import java.util.Scanner;

public class PW_Ass_3_QST_4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a= sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();

        System.out.println(a<50 && a<b);
        System.out.println(a<50 || a<b);

    }


}
