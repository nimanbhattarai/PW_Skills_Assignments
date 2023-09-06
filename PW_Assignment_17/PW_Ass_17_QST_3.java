package PW_Skills_Assignment.PW_Assignment_17;

import java.util.Scanner;

public class PW_Ass_17_QST_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the dimension: ");
        int n= sc.nextInt();

        int [][]matrix =new int[n][n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(j>=i){
                    System.out.print(matrix[i][j] + " ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
