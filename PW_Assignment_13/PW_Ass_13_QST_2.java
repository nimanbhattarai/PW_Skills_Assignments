package PW_Skills_Assignment.PW_Assignment_13;

import java.util.Arrays;
import java.util.Scanner;

public class PW_Ass_13_QST_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n]; //store the n integers in an array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);//on sorting, same integers will get aligned in consecutive indices
        int i = 0;
        int count = 0;
        while (i < n) {
            count++;
            while (i < n - 1 && arr[i + 1] == arr[i]) {//skip duplicates of element
                i++;
            }
            i++; //increment 1 more as i was still pointing to the last duplicate of previous element
        }
        if (count >= m) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}
