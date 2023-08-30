package PW_Skills_Assignment.PW_Assignment_15;

import java.util.Scanner;

public class PW_Ass_15_QST_4 {

    static void printArray(int [][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void reverseRowMatrix(int [][]arr) {
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr.length - 1;
            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the dimension of array: ");
        int n= sc.nextInt();
        int m= sc.nextInt();

        int matrix[][]=new int[n][m];

        System.out.println("Enter the elements of array: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        reverseRowMatrix(matrix);
        printArray(matrix);
    }
}
