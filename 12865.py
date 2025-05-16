import sys

n, k = map(int, input().split())
max_value = [0] * (k + 1) # dp배열

for i in range(n):
    weight, value = map(int, input().split())
    for j in range(k, weight-1, -1):
        max_value[j] = max(max_value[j], max_value[j - weight] + value)

print(max_value[k])