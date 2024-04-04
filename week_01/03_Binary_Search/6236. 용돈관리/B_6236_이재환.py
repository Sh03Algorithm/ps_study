#No. 6236 by inthebleakmidwinter

if __name__ == "__main__" :
    N, M = map(int, input().split())
    amount = [int(input()) for _ in range(N)]
    left, right, ans = max(amount), sum(amount), 0
    while left<=right :
        mid = int((left+right)/2)
        rest, m, flag = mid, 1, False
        for a in amount :
            if mid < a :
                flag = True
                break
            if rest < a :
                rest = mid
                m+=1
            rest-=a
        if flag or m>M :
            left = mid+1
        else :
            right = mid-1
            ans = mid
    print(ans)
