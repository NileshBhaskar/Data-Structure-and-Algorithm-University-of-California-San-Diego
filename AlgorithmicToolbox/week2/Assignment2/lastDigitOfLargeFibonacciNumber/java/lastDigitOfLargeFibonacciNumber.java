package lastDigitOfLargeFibonacciNumber;
import java.util.*;
public class lastDigitOfLargeFibonacciNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        if(n<1)
        {
            System.out.println(n);
            return;
        }
        arr[0] = 0;
        arr[1] = 1;
        int ans = 0;
        for (int i = 2; i <= n; i++){
            arr[i] = (arr[i - 1]%10 + arr[i - 2]%10);
            ans = arr[i] % 10;
        }
        System.out.println(ans);
    }
}