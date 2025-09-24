from sys import stdin

input = stdin.readline

k, n = map(int, input().split())

cables = []

for i in range(k):
    cables.append(int(input()))

longer = max(cables)
shorter = 1
result = 0

while longer >= shorter:
    mid = (longer + shorter) // 2
    count = sum(map(lambda cable: cable // mid, cables))

    if count >= n:
        result = mid
        shorter = mid + 1
    else:
        longer = mid - 1

print(result)