#No. 10814 by inthebleakmidwinter - mem : 56140KB, time : 4360ms

if __name__ == "__main__" :
    N = int(input())
    mems = sorted([[info for info in map(str, input().split())]
                    for _ in range(N)],
                    key=lambda x:int(x[0]))
    for age, name in mems : print(age, name)
