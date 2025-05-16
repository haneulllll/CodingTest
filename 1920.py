import sys

# st, en : 인덱스
# target : 값
def search(st, en, target):
    if st == en:
        if nums[st] == target:
            return 1
        return 0

    mid = (st + en) // 2
    if nums[mid] < target:
        return search(mid + 1, en, target)
    else:
        return search(st, mid, target)

n = int(input())
nums = list(map(int, input().split()))
nums.sort()

m = int(input())
target = list(map(int, input().split()))

for i in target:
    st = 0
    en = n-1
    if search(st, en, i) == 1:
        print(1)
    else:
        print(0)