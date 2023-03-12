// Q4 - Write a Java method to find the smallest number among three numbers.

package PW_Skills_Assignment.PW_Assignment_8;

import  java.util.Scanner;
public class PW_Ass_8_QST_4 {

    static class Number {
        public static int smallest(int a, int b, int c) {
            return Math.min(a, Math.min(b, c));
        }
    }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(Number.smallest(a,b,c));

        }

    }
