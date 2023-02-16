package PW_Skills_Assignment;

import java.util.Scanner;

public class PW_Ass_2_QST_3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Total Marks Stored In Maths is: ");
        int maths=sc.nextInt();

        System.out.print("Total Marks Stored In English is: ");
        int English=sc.nextInt();

        System.out.print("Total Marks Stored In Science is: ");
        int Science=sc.nextInt();

        int TotalMarks=maths+English+Science;
        System.out.println("The Total Marks is: "+TotalMarks);

        int Percentage=(TotalMarks)/3;
        System.out.println("The Total Percentage is: "+Percentage);

    }
}
