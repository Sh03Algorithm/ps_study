#No. 1120 by inthebleakmidwinter

if __name__ == "__main__" :
    A, B = map(str, input().split())
    ans = len(A)
    for n in range(len(B)-len(A)+1) :
        val = 0
        for m in range(len(A)) :
            if A[m] != B[n+m] : val += 1
        if ans > val : ans = val
    print(ans)
