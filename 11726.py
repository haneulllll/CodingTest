import sys
n = int(input())

# 방법 1. 빈 리스트로 초기화 후 append 이용해 값 추가
answer = []

for i in range(n):
    if i == 0:
        answer.append(1)
    elif i == 1:
        answer.append(2)
    else:
        answer.append(answer[i-1] + answer[i-2])

print(answer[n-1] % 10007)

# 방법 2. 크기만큼 0으로 초기화 후 인덱스(answer[i]) 이용해 값 변경
answer = [0] * n

for i in range(n):
    if i == 0:
        answer[i] = 1
    elif i == 1:
        answer[i] = 2
    else:
        answer[i] = answer[i-1] + answer[i-2]

print(answer[n-1] % 10007)