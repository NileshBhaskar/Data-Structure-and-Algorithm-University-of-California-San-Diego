

import java.util.*;
public class lastDigitSumOfFinonacci {
    public static long repetation(long m) {
        long prev = 0;
        long current = 1;
        long res = 0;
        for (long i = 0; i < m * m; i++) {
            long temp = (prev + current) % m;
            prev = current;
            current = temp;
            if (prev == 0 && current == 1)
                return i + 1;
        }
        return res;
    }

    public static long fib(long n, long m) {
        if (n <= 1)
            return n;
        long curr = 1;
        long prev = 0;
        long sum = 1;
        for (long i = 0; i < n - 1; i++) {
            long temp = (curr + prev) % m;
            prev = curr % m;
            curr = temp % m;
            sum += curr % m;
        }
        return sum % 10;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mod = 10;
        
        if (n <= 60) {
            System.out.println(fib(n , 10));
        } else {
            long temp = fib(n % repetation(10), 10) % 10;
            long q = n / repetation(10);
            System.out.println( (temp + ((fib(repetation(10),10)*q)%10))%10);
        }
    }
}