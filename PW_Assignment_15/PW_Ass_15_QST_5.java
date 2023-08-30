package PW_Skills_Assignment.PW_Assignment_15;

import java.util.Scanner;

public class PW_Ass_15_QST_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimension of array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the X: ");
        int x = sc.nextInt();

        int i = 0;
        int j = m - 1;
        while (i < n && j >= 0) {
            if (arr[i][j] == x) {
                System.out.println("Row: " + i);
                System.out.println("Column: " + j);
                return;
            }
            if(arr[i][j]>x)
                j--;
            else
                i++;

            System.out.println(-1);

        }
    }
}


