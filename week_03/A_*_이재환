-----------------------------------------------------No. 1592-----------------------------------------------------
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());

        int[] c = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++) c[i]=i;
        int j=0;
        while(true) {
            b[j] += 1;
            if(b[j]==m) break;
            if(b[j]%2==1) j=(j+l)%n;
            else if(j>=l) {j=j-l;} else j=n+j-l;
        }
        int ans=0;
        for(int num:b) ans+=num;
        System.out.println(ans-1);
    }
}

-----------------------------------------------------No. 2563-----------------------------------------------------
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st;
        int y,x,ans=0;
        boolean[][] w = new boolean[100][100];
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            y = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            for(int j=y;j<y+10;j++) {
                for(int k=x;k<x+10;k++) {
                    if(!w[j][k]) {
                        w[j][k]=true;
                        ans+=1;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
-----------------------------------------------------Python-----------------------------------------------------
#No. 2292 by inthebleakmidwinter

if __name__ == "__main__" :
    N=int(input())
    dep,a,d=1,1,6
    while True:
        if a>=N:
            break
        a+=d
        d+=6
        dep+=1
    print(dep)

#No. 2798 by inthebleakmidwinter
import sys
sys.setrecursionlimit(10**7)

def dfs(cur,i,d):
    global mx
    if d==3:
        if mx<cur<=M:
            mx=cur
    else :
        for j in range(i,N):
            dfs(cur+c[j],j+1,d+1)

if __name__ == "__main__" :
    N,M=map(int, input().split())
    c=list(map(int, input().split()))
    mx=0
    dfs(0,0,0)
    print(mx)

#No. 2810 by inthebleakmidwinter

if __name__ == "__main__" :
    N=int(input())
    line = list(input())
    i,c,count=0,0,0
    while c!=N:
        if line[i]=='S':
            line.insert(i+1,'*')
            i+=2
            c+=1
        elif line[i]=='L':
            line.insert(i+2,'*')
            i+=3
            c+=2
    line.insert(0, '*')
    for i,c in enumerate(line):
        if c=='S' or c=='L':
            if line[i-1]=='*':
                count+=1
                line[i-1]='X'
            elif line[i+1]=='*':
                count+=1
                line[i+1]='X'
    print(count)

#No. 2851 by inthebleakmidwinter

if __name__ == "__main__" :
    m=[int(input()) for _ in range(10)]
    ans=0
    for i in range(10):
        s=sum(m[:i+1])
        if abs(ans-100)>=abs(s-100) and ans<s: ans=s
    print(ans)

#No. 2941 by inthebleakmidwinter

if __name__ == "__main__" :
    w=input()
    i,c,t=0,0,['c=','c-','d-','lj','nj','s=','z=']
    while i<len(w):
        if w[i:i+2] in t:
            c+=1
            i+=2
        elif w[i:i+3]=='dz=':
            c+=1
            i+=3
        else :
            c+=1
            i+=1
    print(c)

#No. 2999 by inthebleakmidwinter

if __name__ == "__main__" :
    m=input()
    r_,r,c=1,1,len(m)
    while True:
        if r_>len(m)**(1/2):
            break
        elif len(m)%r_==0:
            r=r_
            c=int(len(m)/r)
        r_+=1
    mat=[]
    for i in range(c):
        mat.append(list(m[i*r:(i+1)*r]))
    mat=[list(x) for x in list(zip(*mat))]
    [print(''.join(x),end='') for x in mat]

#No. 3985 by inthebleakmidwinter

if __name__ == "__main__" :
    L,N=int(input()),int(input())
    c,n=[-1]*L,[0]*N
    p=[[i for i in map(int,input().split())] for _ in range(N)]
    e_s=[e-s for s,e in p]
    for i,[s,e] in enumerate(p):
        for j in range(s-1,e):
            if c[j]==-1:
                c[j]=i
                n[i]+=1
    [print(x) for x in [e_s.index(max(e_s))+1,n.index(max(n))+1]]

#No. 3052

print(len({int(input())%42:0 for _ in range(10)}))

#No. 8320 by inthebleakmidwinter

if __name__ == "__main__" :
    N,m,a=int(input()),1,0
    for n in range(1,N+1) :
        m=1
        while m<=n**(1/2):
            if n%m==0:a+=1
            m+=1
    print(a)

#No. 8958 by inthebleakmidwinter

if __name__ == "__main__" :
    T=int(input())
    ans=[0]*T
    for t in range(T):
        s=input()
        st=0
        for i in range(len(s)):
            if s[i]=='O':
                st+=1
                ans[t]+=st
            else :
                st=0
    [print(x) for x in ans]

#No. 2839 by inthebleakmidwinter

if __name__ == "__main__" :
    N=int(input())
    ans=N//5
    while ans>=0:
        if (N-ans*5)%3==0:
            break
        else :ans-=1
    print(ans+(N-ans*5)//3 if ans>=0 else -1)

#No. 11399 by inthebleakmidwinter

if __name__ == "__main__" :
    N,p=int(input()),list(map(int,input().split()))
    p.sort()
    a,t=0,0
    for n in range(N):
        t+=p[n]
        a+=t
    print(a)

#No. 2605 by inthebleakmidwinter

if __name__ == "__main__" :
    N,n=int(input()),list(map(int,input().split()))
    ans=[]
    for i in range(N):
        ans.insert(i-n[i], i+1)
    print(' '.join([str(x) for x in ans]))

#No. 2578 by inthebleakmidwinter

if __name__=="__main__" :
    c,b=[0]*26,[5]*12
    for i in range(5):
        for j,k in enumerate(map(int, input().split())):
            c[k]=(i,j)
    od,ct=[],0
    for _ in range(5):od.extend(list(map(int,input().split())))
    for i,n in enumerate(od):
        x,y=c[n]
        b[x]-=1
        if not b[x]:ct+=1
        b[5+y]-=1
        if not b[5+y]:ct+=1
        if x==y:
            b[10]-=1
            if not b[10]:ct+=1
        if x+y==4:
            b[11]-=1
            if not b[11]:ct+=1
        if ct>=3:break
    print(i+1)
