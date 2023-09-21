package PW_Skills_Assignment.PW_Assignment_21;

import java.util.Scanner;

public class PW_Ass_21_QST_2 {

    static int SUM(int n,int m){
        if (m == 1)
            return (n * (n + 1) / 2);

        int sum = SUM(n, m - 1);

        return (sum * (sum + 1) / 2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();

        System.out.println("Enter m: ");
        int m= sc.nextInt();

        System.out.println("SUM(" + n + ", " + m + "): " + SUM(n, m));
        }
    }
