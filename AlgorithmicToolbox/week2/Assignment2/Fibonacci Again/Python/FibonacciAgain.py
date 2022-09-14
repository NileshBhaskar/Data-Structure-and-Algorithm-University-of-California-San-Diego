def repetation(m):
    prev = 0
    current = 1    
    res = 0
    for i in range(0,m*m):
        temp = (prev + current) % m
        prev = current
        current = temp
        if (prev == 0 and current == 1):
                res = i + 1
    return res
    

def fib(n, m):
    if (n <= 1):
        return n
    curr = 1
    prev = 0
    for i in range(0,n-1):
        temp = (curr + prev) % m
        prev = curr % m
        curr = temp % m
        
    return curr

    
n,mod = map(int,input().split())
act = n % repetation(mod)
ans = fib(act, mod)
print(ans)