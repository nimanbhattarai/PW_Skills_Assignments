package PW_Skills_Assignment.PW_Assignment_13;

import java.util.Scanner;

public class PW_Ass_13_QST_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int odd=0; int even=0; int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i % 2==1){
                int temp=odd;
                odd=even;
                even=temp;
                odd++;
            }
            else {
                even++;
            }
            sum=sum+odd;
        }
        System.out.println(sum);
    }
}
