from sys import stdin
input = stdin.readline

n = int(input())

roads = list(map(int, input().split()))
stations = list(map(int, input().split()))

stations.pop()
budget = 0
cheapest = stations[0]

for i in range(n - 1):
    if i == 0 or stations[i] < cheapest:
        budget += stations[i] * roads[i]
        cheapest = stations[i]
    else:
        budget += cheapest * roads[i]

print(budget)