package PW_Skills_Assignment.PW_Assignment_17;

import java.util.Scanner;

public class PW_Ass_17_QST_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the dimension of matrix: ");
        int n= sc.nextInt();

        int [][]matrix=new int[n][n];
        System.out.println("Enter the elements of matrix: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for (int i=0;i< n;i++){
            for (int j=0;j< n;j++){
                if(i==j || i+j==n-1){
                    if(matrix[i][j]==0){
                        System.out.println("false");
                        return;
                    }
                }
                else {
                    if(matrix[i][j]!=0){
                        System.out.println("false");
                        return;
                    }
                }
            }
        }
        System.out.println("true");
    }
}
