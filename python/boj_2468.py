from collections import deque
from sys import stdin

input = stdin.readline

grid = []
visited = []
dx = [0, 1, 0, -1]
dy = [-1, 0, 1, 0]
n = 0

def in_bound(x, y):
    return 0 <= x < n and 0 <= y < n

def bfs(x, y, flood_level):
    queue = deque()
    queue.append((x, y))
    visited[x][y] = True

    while queue:
        cx, cy = queue.popleft()
        for i in range(4):
            nx = cx + dx[i]
            ny = cy + dy[i]
            if in_bound(nx, ny) and not visited[nx][ny] and grid[nx][ny] > flood_level:
                visited[nx][ny] = True
                queue.append((nx, ny))

n = int(input())

for _ in range(n):
    grid.append(list(map(int, input().split())))

visited = [[False] * n for _ in range(n)]

temp_fragment = 0
fragment = 0

for flood_level in range(100):
    for i in range(n):
        for j in range(n):
            if grid[i][j] > flood_level and not visited[i][j]:
                temp_fragment += 1
                bfs(i, j, flood_level)

    fragment = max(fragment, temp_fragment)
    temp_fragment = 0

    for i in range(n):
        for j in range(n):
            visited[i][j] = False

print(fragment)