n = int(input())

arr = [0,1]
ans = 0
for i in range(2,n+1):
    arr.append(arr[i-1]%10 + arr[i-2]%10)
    ans = arr[i]%10


print(ans)