#No. 11651 by inthebleakmidwinter

if __name__ == "__main__" :
    N = int(input())
    [print(d[0], d[1]) for d in sorted(sorted([[n for n in map(int, input().split())] 
                   for _ in range(N)], key=lambda x:x[0]), key=lambda x:x[1])]
