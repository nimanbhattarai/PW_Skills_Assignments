package PW_Skills_Assignment.PW_Assignment_18;

import java.util.ArrayList;
import java.util.Scanner;

public class PW_Ass_18_QST_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array list: ");
        int n=sc.nextInt();


        ArrayList <Integer> list=new ArrayList<>();

        System.out.println("Enter the element of array list: ");
        for(int i=0;i<n;i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Enter the elements to be inserted: ");
        int x=sc.nextInt();
        list.add(0,x);
        for(int k=0;k<list.size();k++){
            System.out.print(list.get(k) + " ");
        }


    }
}
