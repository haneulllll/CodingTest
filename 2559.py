n, k = map(int, input().split())
temp = list(map(int, input().split()))

start = 0
end = k-1
total = sum(temp[:k])
max_total = sum(temp[:k])

while end != n-1:
        total -= temp[start]
        start += 1
        end += 1
        total += temp[end]
        # print(total) 디버깅 코드
        max_total = max(total, max_total)

print(max_total)

