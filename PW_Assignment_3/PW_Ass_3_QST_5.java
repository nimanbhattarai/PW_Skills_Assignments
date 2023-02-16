/* Q5 - Find the total number of bits needed to be flipped to convert x to y.*/

package PW_Skills_Assignment.PW_Assignment_3;

import java.util.Scanner;

public class PW_Ass_3_QST_5 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = a ^ b;
            int count = 0;
            while (x != 0){
                x= x& (x - 1);
                count++;
            }
            System.out.print(count);
        }
}
