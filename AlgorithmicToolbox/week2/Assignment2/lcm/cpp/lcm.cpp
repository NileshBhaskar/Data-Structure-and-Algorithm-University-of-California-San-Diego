#include <iostream>

using namespace std;

long long gcd(long long a, long long b)
{
    if (b == 0)
        return a;
    return gcd(b, a % b);
}

int main()
{
    long long a;
    long long b;
    cin>>a;
    cin >> b;
    long long hcf = gcd(a, b);
    cout << (a * b) / hcf ;
    return 0;
}