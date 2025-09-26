from sys import stdin
from collections import deque
input = stdin.readline

grid = []
visited = []
dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

def in_bound(grid, x, y):
    return 0 <= x < len(grid) and 0 <= y < len(grid[0])


def bfs(x, y):
    global visited
    global grid
    queue = deque()
    count = 0

    queue.append((x, y))
    visited[x][y] = True
    count += 1

    while queue:
        cx, cy = queue.popleft()
        for i in range(4):
            nx = cx + dx[i]
            ny = cy + dy[i]
            if in_bound(grid, nx, ny) and not visited[nx][ny] and grid[nx][ny] == 1:
                queue.append((nx, ny))
                visited[nx][ny] = True
                count += 1
    return count

for _ in range(int(input())):
    grid.append(list(map(int, list(input().strip()))))

visited = [[False] * len(grid[0]) for _ in range(len(grid))]

apartment = 0
counts = []

for i in range(len(grid)):
    for j in range(len(grid[0])):
        if grid[i][j] == 0 or visited[i][j]:
            continue
        apartment += 1
        counts.append(bfs(i, j))

counts.sort()

print(apartment)
for count in counts:
    print(count)