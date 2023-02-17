/*Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication
        and division.*/

package PW_Skills_Assignment.PW_Assignment_4;

import java.util.Scanner;

public class PW_Ass_4_QST_5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Operation '+,'-','*','/'");
        String op= sc.next();

        System.out.println("Enter the first number");
        int a=sc.nextInt();

        System.out.println("Enter the second number");
        int b= sc.nextInt();

        switch(op) {
            case "+":
            {
                int addition = a + b;
                System.out.println("The Addition is: "+addition);
                break;
            }

            case "-": {
                int subtraction = a - b;
                System.out.println("The Subtraction is: "+subtraction);
                break;
            }
            case "*":
            {
                int multiplication = a * b;
                System.out.println("The multiplication is: "+multiplication);
                break;
            }
            case "/":
            {
                int division = a / b;
                System.out.println("The Division is: "+division);
                break;
            }
            default:
            {
                System.out.println("Invalid choice");
            }
        }

    }
}
