// Q3 - Write a Java method to display the middle character of a string.

package PW_Skills_Assignment.PW_Assignment_8;

import java.util.Scanner;
  class Middle {
      public static String middle(String s) {
          if (s.length() % 2 == 0) {
              return s.substring(s.length() / 2, s.length() / 2 + 2);
          } else {
              return s.substring(s.length() / 2, s.length() / 2 + 1);
          }
      }
  }
      public class PW_Ass_8_QST_3 {
          public static void main(String[] args) {
              Middle obj=new Middle();
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the string");
              String s = sc.nextLine();
              System.out.println(Middle.middle(s));
          }
      }



