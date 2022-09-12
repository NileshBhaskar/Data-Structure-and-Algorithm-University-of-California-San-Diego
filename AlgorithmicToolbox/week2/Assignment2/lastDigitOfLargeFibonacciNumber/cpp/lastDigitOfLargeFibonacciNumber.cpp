#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    long long arr[n + 1];
    long long ans = 0;
    if (n <= 1)
    {
        cout << n;
        return 0;
    }
    arr[0] = 0;
    arr[1] = 1;
    for (int i = 2; i <= n; i++){
        arr[i] = (arr[i - 1]%10 + arr[i - 2]%10);
        ans = arr[i] % 10;
    }
    cout << ans;
    return 0;
}