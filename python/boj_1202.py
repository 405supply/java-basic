from sys import stdin
import heapq

input = stdin.readline

gems = []
bags = []
available_gems = []
total = 0

n, k = map(int, input().split())

for i in range(n):
    mass, value = map(int, input().split())
    heapq.heappush(gems, (mass, value))

for i in range(k):
    bags.append(int(input()))

bags.sort()

for bag in bags:
    while gems:
        mass, value = heapq.heappop(gems)
        if mass <= bag:
            heapq.heappush(available_gems, -value)
        else:
            heapq.heappush(gems, (mass, value))
            break
    if available_gems:
        total += abs(heapq.heappop(available_gems))

print(total)