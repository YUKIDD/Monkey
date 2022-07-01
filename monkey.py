from random import randint

# python 版猴子问题

length = 20
apes = []

for i in range(0,length):
    apes.append(20)

def god(min,max,exclude):
    i = randint(min,max)
    while i == exclude :
        i = randint(min,max)
    return i

for i in range(0,365 * 20):
    for j in range(0,length):
        if apes[j] != 0:
            apes[j] -= 1
            apes[god(0,length-1,j)] += 1

apes.sort()
for i in range(0,length):
    print('-' * apes[i],apes[i])