import java.util.*;
public class lastDigitOfSumOfSquareOfFibonacciNumber {
    public static long fib(long n, long m) {
        if (n <= 1)
            return n;
        long curr = 1;
        long prev = 0;
        long sum = 0;
        for (long i = 0; i <= n; i++) {
            // System.out.println(i);
            sum = (sum + (prev * prev) % m) % 10;
            // System.out.println(prev + " " + curr);
            long temp = (curr + prev) % m;
            prev = curr % m;
            curr = temp % m;
            
            
            // System.out.println(prev + " " + curr);
            // System.out.println((prev*prev)%m);
            
            // System.out.println(prev+" "+curr+" "+sum);
        }
        return sum % 10;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n <= 60) {
            System.out.println(fib(n, 10));
        } else {
            long temp = fib(n % 60, 10) % 10;
            long q = n / 60;
            System.out.println((temp + ((fib(60, 10) * q) % 10)) % 10);
        }
    }
}