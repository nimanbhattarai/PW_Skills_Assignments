package PW_Skills_Assignment.PW_Assignment_11;

import java.util.Scanner;

public class PW_Ass_11_QST_2 {

    static int occurrenceNumber(int arr[],int x) {
        int ans=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                ans++;
            }
        }
        return ans;

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

        System.out.print("Enter X: ");
        int x = sc.nextInt();


        System.out.print("The occurrence of the number is: "+occurrenceNumber(arr,x));


        }
    }

