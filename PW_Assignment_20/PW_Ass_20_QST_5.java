/*
Q5. Calculate the time complexity of the given function:

public static void fun(int n){
for (int i = 0; i < n / 2; i++)
for (int j = 1; j + n / 2 <= n; j++)
for (int k = 1; k <= n; k = k * 2)
System.out.println(“hello”);
}

Answer --> O(n log n).
 */