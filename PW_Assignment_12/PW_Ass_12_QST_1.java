package PW_Skills_Assignment.PW_Assignment_12;

import java.util.Scanner;

public class PW_Ass_12_QST_1 {

    static int repeatingNumber(int arr[]){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();

        int arr[]=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The repeating number is: "+repeatingNumber(arr));

    }
}
