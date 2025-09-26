from sys import stdin
from collections import deque

input = stdin.readline

n, m, k = map(int, input().split())

grid = [[False] * n for _ in range(m)]
squares = []

dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

def in_bound(grid, x, y):
    return 0 <= x < len(grid) and 0 <= y < len(grid[0])


def bfs(x, y):
    global grid
    queue = deque()
    count = 0

    queue.append((x, y))
    grid[x][y] = True
    count += 1

    while queue:
        cx, cy = queue.popleft()
        for i in range(4):
            nx = cx + dx[i]
            ny = cy + dy[i]
            if in_bound(grid, nx, ny) and not grid[nx][ny] == 1:
                queue.append((nx, ny))
                grid[nx][ny] = True
                count += 1
    return count

for i in range(k):
    squares.append((map(int, input().split())))

for square in squares:
    x1, y1, x2, y2 = square
    for i in range(x1, x2):
        for j in range(y1, y2):
            grid[i][j] = True

fragment = 0
area = []

for i in range(len(grid)):
    for j in range(len(grid[0])):
        if not grid[i][j]:
            fragment += 1
            area.append(bfs(i, j))

print(fragment)
area.sort()
for a in area:
    print(a, end=' ')


