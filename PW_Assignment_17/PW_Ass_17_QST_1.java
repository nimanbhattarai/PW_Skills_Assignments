package PW_Skills_Assignment.PW_Assignment_17;

import java.util.Scanner;

public class PW_Ass_17_QST_1 {

    static void printMatrix(int[][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j< matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void findingPrefixSum(int [][] matrix){
        int r= matrix.length;
        int c= matrix[0].length;

        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                matrix[i][j]=matrix[i][j] + matrix[i][j-1];
            }
        }

        for (int j=0;j<c;j++){
            for (int i=1;i<r;i++){
                matrix[i][j]=matrix[i][j] + matrix[i-1][j];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the dimension of array: ");
        int r= sc.nextInt();
        int c= sc.nextInt();

        int [][]matrix=new int[r][c];

        System.out.println("Enter the elements of matrix: ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        findingPrefixSum(matrix);
        printMatrix(matrix);
    }

}
