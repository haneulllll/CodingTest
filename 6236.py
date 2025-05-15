import sys

n,m = map(int,(input().split()))

money = []
for i in range(n):
    money.append(int(input()))

start = max(money)
end = sum(money)

min_k = 0
while start <= end:
    mid = (start+end) // 2

    total = 0
    count = 0
    for i in money:
        if total + i <= mid :
            total += i
        else:
            count += 1
            total = 0
            total += i
    if total:
        count += 1

    if count > m :
        start = mid + 1
    else:
        end = mid - 1
        min_k = mid

print(min_k)