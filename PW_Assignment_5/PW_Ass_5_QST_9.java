package PW_Skills_Assignment.PW_Assignment_5;

import java.util.Scanner;

public class PW_Ass_5_QST_9 {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(isPrime(n) && isPrime(n-2))
            {
                System.out.print(true);
            }
            else
            {
                System.out.print(false);
            }
        }
        public static boolean isPrime(int n){
            if (n <= 1)
                return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0)
                return false;
            }
            return true;
        }

}
