#No. 1026 by inthebleakmidwinter

if __name__ == "__main__" :
    N, flag = int(input()), [False, True]
    ab = [sorted([n for n in map(int, input().split())], reverse=flag[i]) for i in range(2)]
    print(sum([s1*s2 for s1,s2 in zip(ab[0],ab[1])]))
