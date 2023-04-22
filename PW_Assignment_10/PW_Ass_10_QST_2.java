package PW_Skills_Assignment.PW_Assignment_10;

import java.util.Scanner;
public class PW_Ass_10_QST_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arrays: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            boolean check = false;
            for(int j = 0; j < n; j++){
                if(b[i] == a[j]){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println(b[i]);
            }
        }
    }
}
