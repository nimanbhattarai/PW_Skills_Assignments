// Q2 - Write a Java method to count all vowels in a string.

package PW_Skills_Assignment.PW_Assignment_8;

import java.util.Scanner;

class vowel {
    public static int count(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static class PW_Ass_8_QST_2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");
            String a = sc.nextLine();
            System.out.println(count(a));

        }
    }
}
