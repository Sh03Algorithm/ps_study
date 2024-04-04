#No. 13301 by inthebleakmidwinter

if __name__ == "__main__" :
    N = int(input())
    a, b = 1, 1
    for _ in range(N-1) :
        a, b = b, a+b
    print(2*(a+b))
