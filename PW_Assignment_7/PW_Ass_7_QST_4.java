package PW_Skills_Assignment.PW_Assignment_7;

import java.util.Scanner;

public class PW_Ass_7_QST_4 {

    static class Complex
    {
        int real;
        int img;
        public Complex(int r,int i)
        {
            real=r;
            img=i;
        }
        public static Complex add(Complex a,Complex b)
        {
            return new Complex((a.real+b.real),(a.img+b.img));
        }
        public static Complex sub(Complex a,Complex b)
        {
            return new Complex((a.real-b.real),(a.img - b.img));
        }
        public static Complex mul(Complex a,Complex b)
        {
            return new Complex(((a.real*b.real)-(a.img*b.img)),(a.real*b.img)+(a.img*b.real));
        }


    }
}
