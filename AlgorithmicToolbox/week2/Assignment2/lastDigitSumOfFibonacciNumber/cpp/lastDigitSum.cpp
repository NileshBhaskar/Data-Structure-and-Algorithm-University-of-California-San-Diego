 #include <iostream>
using namespace std;
long long int repetation(long m)
{
    long long int prev = 0;
    long long int current = 1;
    long long int res = 0;
    for (long long int i = 0; i < m * m; i++)
    {
        long long int temp = (prev + current) % m;
        prev = current;
        current = temp;
        if (prev == 0 && current == 1)
            res = i + 1;
    }
    return res;
    }


    long long int fib(long long int n, long long int m)
    {
        if (n <= 1)
            return n;
        long long int curr = 1;
        long long int prev = 0;
        for (long long int i = 0; i < n - 1; i++)
        {
            long long int temp = (curr + prev) % m;
            prev = curr % m;
            curr = temp % m;
        }
        return curr;
    }

int main()
    {
        long long int n;
        cin >> n;
        long long int mod;
        mod = 10;
        if(n<=10){
            cout << fib(n,10)%10;
        }
        else{
            long long int temp = fib(n % repetation(10), 10) % 10;
            long long int q = n / repetation(10);
            cout<< ((temp + ((fib(repetation(10), 10) * q) % 10)) % 10);
        }
        return 0;
    }
