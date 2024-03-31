#No. 1920 by inthebleakmidwinter

if __name__ == "__main__" :
    N = int(input())
    a = sorted([n for n in map(int, input().split())])
    M = int(input())
    ist = [n for n in map(int, input().split())]
    for k in ist :
        left, right, res = 0, N-1, 0.5
        while left<=right :
            mid = (left+right)//2
            if k < a[mid] :
                right = mid-1
            else : 
                left = mid+1
                res = a[mid]
        print(1 if res==k else 0)
