

public class Fibonacci {
    public static void main(String[] args) {
        int n = 8; // Example input
        int result = fibonacci(n);
        System.out.println("The " + n + "-th Fibonacci number is: " + result);
    }
    
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        int fibPrev = 0;
        int fibCurrent = 1;

        for (int i = 2; i <= n; i++) {
            int fibNext = fibPrev + fibCurrent;
            fibPrev = fibCurrent;
            fibCurrent = fibNext;
        }

        return fibCurrent;
    }
}

