package PW_Skills_Assignment.PW_Assignment_18;

import java.util.ArrayList;
import java.util.Scanner;

public class PW_Ass_18_QST_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array list: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the elements of array list: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }


        for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= 0) {
                    System.out.println(list.get(i));
                }

        }

//        if (list.size() == 0) {
//            System.out.println("NA");
//            return;
//        }

    }
}
