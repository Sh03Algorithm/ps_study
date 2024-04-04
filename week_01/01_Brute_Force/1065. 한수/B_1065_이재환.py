#No. 1065 by inthebleakmidwinter

if __name__ == "__main__" :
    ans=0
    for n in range(1,int(input())+1) :
        if n<100 :
            ans+=1
        else :
            if (n//10)%10*2 == n//100+n%10 :
                ans+=1
    print(ans)
