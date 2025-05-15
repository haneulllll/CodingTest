import sys

n = int(input())

start = 1
end = 1
total = 1
count = 0

while start <= n:
    if total == n:
        count += 1
        total -= start
        start += 1
    elif total > n:
        total -= start
        start += 1
    else:
        end += 1
        total += end

print(count)
