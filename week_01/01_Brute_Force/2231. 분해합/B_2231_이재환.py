#No. 2231 by inthebleakmidwinter

def desum(n) :
    res = n
    while n>10 :
        res+=n%10
        n//=10
    return res+n
if __name__ == "__main__" :
    N = int(input())
    for i in range(N) :
        if N==desum(i) :
            break
    print(i if i!=N-1 else 0)
