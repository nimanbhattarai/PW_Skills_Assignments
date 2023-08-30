package PW_Skills_Assignment.PW_Assignment_15;


import java.util.Scanner;

public class PW_Ass_15_QST_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of 2d array you want to convert to: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m * n];
        int[][] mat = new int[m][n];

        System.out.println("Enter the elements of 1D array: ");

        for (int i = 0; i < m * n; i++) {
            arr[i] = sc.nextInt();
        }

        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = arr[idx];
                idx++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}