package PW_Skills_Assignment.PW_Assignment_10;

import java.util.Arrays;
import java.util.Scanner;
public class PW_Ass_10_QST_3 {

    static int findingElement(int arr[],int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.print("Enter the "+n+" no. of element: ");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k= sc.nextInt();

        System.out.print("The value is: "+findingElement(arr,k));



    }
}
