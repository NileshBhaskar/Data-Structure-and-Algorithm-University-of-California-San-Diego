import java.util.*;
public class lastDigitSumOfFibonacciAgain {
    public static long fib(long n, long m) {
        long curr = 1;
        long prev = 0;
        long sum = 0;
        if (m < n){
            m += 60;
        }
        for (long i = 0; i <= m; i++) {
            if (i >= n) {
                sum = (sum +  prev % 10)%10;          
            }
            long temp = (curr + prev) % 10;
            prev = curr % 10;
            curr = temp % 10;
        }
        return sum % 10;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if (n == 0) {
            System.out.println(fib(0,m%60));
        }
        if(n-1>=0)
        System.out.println(fib(n%60l,m%60l));
        
    }
}