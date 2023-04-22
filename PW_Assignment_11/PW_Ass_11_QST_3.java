package PW_Skills_Assignment.PW_Assignment_11;

import java.util.Scanner;

public class PW_Ass_11_QST_3 {

    public static int findMissingNumber(int[] arr, int N) {
        int sum = (N * (N + 1)) / 2;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return sum - arrSum;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter N: ");
        int N = sc.nextInt();


        System.out.print("The missing number is: "+findMissingNumber(arr,N));


    }

}
