package PW_Skills_Assignment.PW_Assignment_7;

import java.util.Scanner;

public class PW_Ass_7_QST_3 {

    static class Area
    {
        int length,breadth;
       public  Area(int l,int b)
        {
           length=l;
            breadth=b;
        }

        public int getArea()
        {
            return length*breadth;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int length= sc.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        int breadth= sc.nextInt();
        Area a=new Area(length,breadth);

        System.out.println(a.getArea());


    }
}
