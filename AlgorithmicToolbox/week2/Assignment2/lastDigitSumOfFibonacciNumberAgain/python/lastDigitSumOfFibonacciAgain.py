def fib(n,m):
    curr = 1
    prev = 0
    sum = 0
    if (m < n):
        m += 60
    
    for i in range(0,m+1):
        if (i >= n):
            sum = (sum + prev % 10) % 10
        
        temp = (curr + prev) % 10
        prev = curr % 10
        curr = temp % 10

    return sum % 10

n,m = map(int,input().split())
if (n == 0): 
    print(fib(0,m%60))
        
if(n-1>=0):
    print(fib(n%60,m%60))