#include <iostream>
using namespace std;

long long int fib(long long int n, long long int m)
{
    if (n <= 1)
        return n;
    long long int curr = 1;
    long long int prev = 0;
    long long int sum = 0;
    for (long long int i = 0; i <= n; i++)
    {
        sum = (sum + (prev*prev)%10)%10;
        long long int temp = (curr + prev) % m;
        prev = curr % m;
        curr = temp % m;
    }
    return sum;
}

int main()
{
    long long int n;
    cin >> n;
    long long int mod;
    mod = 10;
    if (n <= 10)
    {
        cout << fib(n, 10) % 10;
    }
    else
    {
        long long int temp = fib(n % 60, 10) % 10;
        long long int q = n / 60;
        cout << ((temp + ((fib(60, 10) * q) % 10)) % 10);
    }
    return 0;
}
