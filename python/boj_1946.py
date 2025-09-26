from sys import stdin

input = stdin.readline

tc = int(input())

for _ in range(tc):
    scores = []
    n = int(input())
    for i in range(n):
       scores.append(list(map(int, input().split())))

    scores.sort()

    count = 1
    min_score = scores[0][1]

    for i in range(1, n):
        if scores[i][1] < min_score:
            count += 1
            min_score = scores[i][1]

    print(count)