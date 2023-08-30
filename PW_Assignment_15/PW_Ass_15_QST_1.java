package PW_Skills_Assignment.PW_Assignment_15;

import java.util.Scanner;

public class PW_Ass_15_QST_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the dimension of array: ");
        int n= sc.nextInt();
        int m= sc.nextInt();

        System.out.println("Enter the elements to be searched: ");
        int x= sc.nextInt();

        int [][]arr=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==x){
                    System.out.println("Row: "+i);
                    System.out.println("Column: "+j);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
