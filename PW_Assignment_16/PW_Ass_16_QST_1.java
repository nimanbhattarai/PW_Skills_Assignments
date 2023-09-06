package PW_Skills_Assignment.PW_Assignment_16;

import java.util.Scanner;

public class PW_Ass_16_QST_1 {

    static void printArray(int [][]matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplication(int [][] a,int r1,int c1,int [][] b,int r2,int c2){
        if(c1!=r2){
            System.out.println(-1);
            return;
        }
        int [][]mul=new int[r1][c2];

        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){

                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Multiplication of 2 Matrices is: ");
        printArray(mul);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no. of rows and column in Matrix 1: ");
        int r1= sc.nextInt();
        int c1= sc.nextInt();

        int [][]a=new int[r1][c1];

        System.out.println("Enter the Matrix 1 values: ");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter the no. of rows and column of matrix 2: ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int b[][]=new int[r2][c2];

        System.out.println("Enter the Matrix 2 values: ");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1: ");
        printArray(a);

        System.out.println("Matrix 2: ");
        printArray(b);

        multiplication(a,r1,c1,b,r2,c2);
    }
}
