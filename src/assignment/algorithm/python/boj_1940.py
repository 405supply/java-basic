from sys import stdin

input = stdin.readline

n = int(input())
m = int(input())

materials = list(map(int, input().split()))

materials.sort()

count = 0
front = 0
rear = len(materials) - 1

while front < rear:
    if materials[front] + materials[rear] == m:
        count += 1
        front += 1
        rear -= 1
    elif materials[front] + materials[rear] > m:
        rear -= 1
    else:
        front += 1


print(count)