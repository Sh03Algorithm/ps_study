#No. 2792 by inthebleakmidwinter
import math
import sys
input = sys.stdin.readline

if __name__ == "__main__" :
    N, M = map(int, input().split())
    nums = [int(input()) for _ in range(M)]
    left, right, ans = 1, max(nums), 0
    while left<=right :
        mid = (left+right)//2
        if sum([math.ceil(num/mid) for num in nums]) > N :
            left = mid+1
        else :
            right = mid-1
            ans = mid
    print(ans)
