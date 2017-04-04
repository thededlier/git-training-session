#2048 GAME

import random
def draw(l):
    for i in range(0,len(l),4):
        print l[i],l[i+1],l[i+2],l[i+3]

def check_2048(l):
    if 2048 in l:
        return True
    return False

def move(l,m):
    if m in ('w','W'):
        move_up(l)
    elif m in ('a','A'):
        move_left(l)
    elif m in ('d','D'):
        move_right(l)
    else:
        move_down(l)

def random_insert(l):
    al = [2,4]
    a = random.randint(0,1)
    b = random.randint(0,15)
    a = al[a]
    while type(l[b]) == int:
        b = random.randint(0,15)
    l[b] = a

def move_up(l):
    for j in range(4):
        for i in [12,8,4,13,9,5,14,10,6,15,11,7]:
            if (l[i]==l[i-4]) and (l[i]<>"-"):
                l[i-4]=l[i] + l[i-4]
                l[i] = '-'
        for i in [12,8,4,13,9,5,14,10,6,15,11,7]:
            if l[i-4]=='-' and type(l[i]) in (int,):
                l[i-4]= l[i]
                l[i] = '-'
    draw(l)
    print
    random_insert(l)
    draw(l)
    print
    
def move_down(l):
    for j in range(4):
        for i in [0,1,2,3,4,5,6,7,8,9,10,11]:
            if (l[i]==l[i+4]) and (l[i]<>"-"):
                l[i+4]=l[i] + l[i+4]
                l[i] = '-'
        for i in [0,1,2,3,4,5,6,7,8,9,10,11]:
            if l[i+4]=='-' and type(l[i]) in (int,):
                l[i+4]= l[i]
                l[i] = '-'
    draw(l)
    print
    random_insert(l)
    draw(l)
    print
    
def move_right(l):
    for j in range(4):
        for i in [0,1,2,4,5,6,8,9,10,12,13,14]:
            if (l[i]==l[i+1]) and (l[i]<>"-"):
                l[i+1]=l[i] + l[i+1]
                l[i] = '-'
        for i in [0,1,2,4,5,6,8,9,10,12,13,14]:
            if l[i+1]=='-' and type(l[i]) in (int,):
                l[i+1]= l[i]
                l[i] = '-'
    draw(l)
    print
    random_insert(l)
    draw(l)
    print
    
def move_left(l):
    for j in range(4):
        for i in [3,2,1,7,6,5,11,10,9,15,14,13]:
            if (l[i]==l[i-1]) and (l[i]<>"-"):
                l[i-1]=l[i] + l[i-1]
                l[i] = '-'
        for i in [3,2,1,7,6,5,11,10,9,15,14,13]:
            if l[i-1]=='-' and type(l[i]) in (int,):
                l[i-1]= l[i]
                l[i] = '-'
    draw(l)
    print
    random_insert(l)
    draw(l)
    print

l = ['-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-']
random_insert(l)
draw(l)
print
while not check_2048(l):
    m = raw_input("enter move")
    move(l,m)
else:
    print 'you win'

