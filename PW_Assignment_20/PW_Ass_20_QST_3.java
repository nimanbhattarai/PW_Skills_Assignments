/*
Q3. Calculate the time complexity of the given function:

public static void fun(int a, int b){
while (a != b) {
if (a > b)
a = a - b;
else
b = b - a;
}
}

Answer -> O(max(a/2,b/2))
          O(max(a, b)),
 */