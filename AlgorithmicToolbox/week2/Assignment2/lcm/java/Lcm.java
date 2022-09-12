// package LCM;
import java.util.*;

public class Lcm {
    public static long gcd(long a,long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long hcf = gcd(a, b);
        // System.out.println(a*b);
        // System.out.println(hcf);
        // System.out.println(((Object)(((a*b)/hcf))).getClass().getSimpleName());
        System.out.println(((a * b) / hcf));
    }
}