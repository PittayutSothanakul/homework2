*Homework2 

Pittayut Sothanakul 5910546678
In A simple recursive function for this is:

public static long fibonacci(int n) {
    // the base case
    if (n < 2) return 1;
    // the recursive step
    return fibonacci(n-1) + fibonacci(n-2);
}

This function is so slow because the fibonacci method is return 2 recursive method. So, it will call recursive agian either in fibonacci(n-1) and in fibonacci(n-2).   
