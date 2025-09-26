from sys import stdin

input = stdin.readline

s, p = map(int, input().split())

dna = list(input().strip())

req_acgt = list(map(int, input().split()))
cur_acgt = [0, 0, 0, 0]

count = 0
front = 0
rear = p - 1

for i in range(0, p):
    if dna[i] == 'A':
        cur_acgt[0] += 1
    if dna[i] == 'C':
        cur_acgt[1] += 1
    if dna[i] == 'G':
        cur_acgt[2] += 1
    if dna[i] == 'T':
        cur_acgt[3] += 1

while rear < len(dna):
    flag = True
    for i in range(4):
        if req_acgt[i] > cur_acgt[i]:
            flag = False

    if flag:
        count += 1

    if dna[front] == 'A':
        cur_acgt[0] -= 1
    if dna[front] == 'C':
        cur_acgt[1] -= 1
    if dna[front] == 'G':
        cur_acgt[2] -= 1
    if dna[front] == 'T':
        cur_acgt[3] -= 1

    front += 1
    rear += 1
    if rear == len(dna):
        break

    if dna[rear] == 'A':
        cur_acgt[0] += 1
    if dna[rear] == 'C':
        cur_acgt[1] += 1
    if dna[rear] == 'G':
        cur_acgt[2] += 1
    if dna[rear] == 'T':
        cur_acgt[3] += 1

print(count)