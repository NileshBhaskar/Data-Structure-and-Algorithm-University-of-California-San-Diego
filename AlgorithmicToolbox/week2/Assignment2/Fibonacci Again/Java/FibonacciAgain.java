import java.util.*;

public class FibonacciAgain {

    public static long repetation(long m) {
        long prev = 0;
        long current = 1;
        long res = 0;
        for (long i = 0; i < m * m; i++) {
            long temp = (prev + current) % m;
            prev = current;
            current = temp;
            if (prev == 0 && current == 1)
                res = i+1;
        }
        return res;
    }

    public static long fib(long n, long m) {
        if (n <= 1)
            return n;
        long curr = 1;
        long prev = 0;
        for (long i = 0; i < n - 1; i++) {
            long temp = (curr + prev) % m;
            prev = curr % m;
            curr = temp % m;
        }
        return curr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mod = sc.nextLong();
        long act = n % repetation(mod);
        // System.out.println(act+" "+fib(act,mod));
        long ans = fib(act, mod);
        System.out.println(ans);

    }

}