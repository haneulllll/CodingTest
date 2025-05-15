import sys

n, d = map(int, input().split())

present = []
for i in range(n):
    p, v = map(int, input().split())
    present.append((p, v))

present.sort(key = lambda x: x[0]) # x[0]: 가격 P

start = 0
total = 0
max_total = 0

for end in range(n):
    total += present[end][1]

    while present[end][0] - present[start][0] >= d:
        total -= present[start][1] # 만족도 빼기
        start += 1

    max_total = max(max_total, total)

print(max_total)