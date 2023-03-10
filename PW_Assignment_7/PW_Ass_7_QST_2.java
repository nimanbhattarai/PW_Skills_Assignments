package PW_Skills_Assignment.PW_Assignment_7;

public class PW_Ass_7_QST_2 {

    static class Triangle
    {
        int a,b,c;
        public double getArea()
        {
            double s=(a+b+c)/2.0;
            return Math.pow(s*(s-a)*(s-b)*(s-c),.5);
        }
        public double getPerimeter()
        {

            return (a+b+c)/2;
        }
    }

    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.a=5;
        t.b=6;
        t.c=2;

        System.out.println(t.getArea());
        System.out.println(t.getPerimeter());

    }
}
