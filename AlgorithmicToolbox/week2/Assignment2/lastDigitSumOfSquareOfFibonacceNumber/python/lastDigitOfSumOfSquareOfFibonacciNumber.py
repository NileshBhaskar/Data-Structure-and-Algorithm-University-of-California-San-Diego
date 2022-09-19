
    

def fib(n, m):
    if (n <= 1):
        return n
    curr = 1
    prev = 0
    sum = 0
    for i in range(0,n+1):
        sum = ( sum + (prev*prev)%10)%10
        temp = (curr + prev) % m
        prev = curr % m
        curr = temp % m
    
    return sum

    
n = int(input())

if (n <= 60):
    print(fib(n , 10)%10)
else:
    # print(n%repetation(10))
    temp = fib(n % 60, 10) % 10
    # print(temp)
    q = (int)(n / 60)
    # print(q)
    print( (temp + ((fib(60,10)*q)%10))%10)