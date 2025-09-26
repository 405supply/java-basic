from sys import stdin
input = stdin.readline

n, m = map(int, input().split())

roads = []
rep = [i for i in range(n+1)]
rep[0] = 1
maintain = 0
most_exp = 0

def find(x):
    if rep[x] != x:
        rep[x] = find(rep[x])
    return rep[x]

def union(x, y):
    ra, rb = find(x), find(y)
    if ra != rb:
        rep[rb] = ra
        return True
    else:
        return False

for i in range(m):
    roads.append(list(map(int, input().split())))

roads.sort(key=lambda x : x[2])

for start, end, cost in roads:
    if union(start, end):
        maintain += cost
        most_exp = cost

print(maintain - most_exp)