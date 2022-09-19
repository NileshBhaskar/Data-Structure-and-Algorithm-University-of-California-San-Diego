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
    sum = 1
    for i in range(0,n-1):
        temp = (curr + prev) % m
        prev = curr % m
        curr = temp % m
        sum += curr % m
    return sum

    
n = int(input())

if (n <= 60):
    print(fib(n , 10)%10)
else:
    # print(n%repetation(10))
    temp = fib(n % repetation(10), 10) % 10
    # print(temp)
    q = (int)(n / repetation(10))
    # print(q)
    print( (temp + ((fib(repetation(10),10)*q)%10))%10)