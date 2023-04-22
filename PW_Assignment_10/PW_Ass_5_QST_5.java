package PW_Skills_Assignment.PW_Assignment_10;

import java.util.Scanner;
public class PW_Ass_5_QST_5 {

    static boolean equality(int arr[],int arr_2[]){
        boolean ans=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr_2[i]){
                ans=false;
                break;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();


        int arr[]=new int[n];
        System.out.print("Enter the 1st element: ");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int arr_2[]=new int[n];
        System.out.print("Enter the 2nd elements: ");
        for(int i=0;i< arr_2.length;i++){
            arr_2[i]=sc.nextInt();
        }

        System.out.print("The element is: "+equality(arr,arr_2));





    }
}
