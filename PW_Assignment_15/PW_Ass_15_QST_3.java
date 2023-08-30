package PW_Skills_Assignment.PW_Assignment_15;

import java.util.Scanner;

public class PW_Ass_15_QST_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the dimension of array: ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        int [][]mat=new int[n][m];
        System.out.println("Enter th elements of array: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the range of row: ");
        int srow= sc.nextInt();
        int erow= sc.nextInt();

        System.out.println("Enter the range of column: ");
        int scol= sc.nextInt();
        int ecol= sc.nextInt();

        int sum=0;

        while(srow<=erow){//row
            while(scol<=ecol){//column
                sum=sum+mat[srow][scol];
                scol++;
            }
            srow++;
        }
        System.out.println("The sum of the given range is: "+sum);
    }
}
