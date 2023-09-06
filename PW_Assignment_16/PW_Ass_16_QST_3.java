package PW_Skills_Assignment.PW_Assignment_16;

import java.util.Scanner;

public class PW_Ass_16_QST_3 {

    static void printArray(int [][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void toeplitzMatrix(int [][]matrix,int n,int m){
        for (int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the dimension: ");
        int n= sc.nextInt();
        int m= sc.nextInt();

        int totalMatrix=n*m;
        int [][]matrix =new int[n][m];
        System.out.println("Enter the "+totalMatrix+" Elements: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        toeplitzMatrix(matrix,n,m);
    }
}
