#include <iostream>
using namespace std;
long fib(unsigned long long int n, unsigned long long int m)
{

    long curr = 1;
    long prev = 0;
    long sum = 0;
    if (m < n)
    {
        m += 60;
    }
    for (unsigned long long int i = 0; i <= m; i++)
    {
        if (i >= n)
        {
            sum = (sum + prev % 10) % 10;
        }
        unsigned long long int temp = (curr + prev) % 10;
        prev = curr % 10;
        curr = temp % 10;
    }
    return sum % 10;
    }

int main(){
        
        unsigned long long int n;
        unsigned long long int m;
        cin>>n;
        cin >> m;
        cout << (fib(n % 60, m % 60));
        return 0;
}
