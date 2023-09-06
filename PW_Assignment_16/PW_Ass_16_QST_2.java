package PW_Skills_Assignment.PW_Assignment_16;

import java.util.Scanner;

public class PW_Ass_16_QST_2 {
    static void printArray(int [][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transposeOfMatrix(int [][]matrix ,int r,int c){
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){

                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    static void rotate90AntiClock(int [][] matrix,int r,int c) {
        transposeOfMatrix(matrix, r, c);
        for (int i = 0; i < r; i++) {
            int temp=matrix[0][i];
            matrix[0][i]=matrix[r-1][i];
            matrix[r-1][i]=temp;

        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the dimension of array: ");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int [][]matrix=new int[r][c];
        System.out.println("Enter the elements of array: ");
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        System.out.println("Original Matrix is: ");
        printArray(matrix);

        rotate90AntiClock(matrix,r,c);
        System.out.println("The rotate matrix is: ");
        printArray(matrix);


    }
}
