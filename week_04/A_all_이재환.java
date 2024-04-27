//-------------------------------------No. 10158-------------------------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine());
        int w=Integer.parseInt(st.nextToken()),h=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int p=Integer.parseInt(st.nextToken()),q=Integer.parseInt(st.nextToken());
        int t=Integer.parseInt(br.readLine());

        p=(p+t)%(2*w);
        q=(q+t)%(2*h);
        System.out.print(p>w?2*w-p:p);
        System.out.print(" ");
        System.out.print(q>h?2*h-q:q);
    }
}

//-------------------------------------No. 2628-------------------------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine());
        int w=Integer.parseInt(st.nextToken()),h=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(br.readLine());
        
        ArrayList<ArrayList<Integer>> p = new ArrayList<>();
        p.add(new ArrayList<>(Arrays.asList(0,h)));
        p.add(new ArrayList<>(Arrays.asList(0,w)));
        
        int x,y;
        for(int i=0;i<n;i++) {
            st=new StringTokenizer(br.readLine());
            x=Integer.parseInt(st.nextToken());
            y=Integer.parseInt(st.nextToken());
            p.get(x).add(y);
        }
        for(ArrayList arr:p) {
            Collections.sort(arr);
        }
        int ans=1;
        int max;
        for(int i=0;i<2;i++) {
            max=0;
            for(int j=0;j<p.get(i).size()-1;j++) {
                if(max<p.get(i).get(j+1)-p.get(i).get(j)) {
                    max=p.get(i).get(j+1)-p.get(i).get(j);
                }
            }
            ans*=max;
        }
        System.out.println(ans);
    }
}

#No. 2564 by inthebleakmidwinter

if __name__ == "__main__" :
    r,c = map(int,input().split())
    block = [None]*((r+c)*2)
    dirt = [None, (2*r+c, -1), (0, 1), (2*r+c, 1), (r+c, -1)]
    n = int(input())
    for i in range(1,n+1):
        di,d = map(int, input().split())
        block[dirt[di][0]+d*dirt[di][1]] = i
    di,d = map(int, input().split())
    ans=0
    dis=1
    while dis<=r+c:
        for p in [-1,1]:
            if block[(dirt[di][0]+d*dirt[di][1]+p*dis)%len(block)]:
                block[(dirt[di][0]+d*dirt[di][1]+p*dis)%len(block)]=None
                ans+=dis
        dis+=1
    print(ans)

#No. 2491 by inthebleakmidwinter

def sol(i) :
    ans=1
    s,e=0,0
    while N-s>ans:
        if an[e+x[i]]<=an[e+y[i]]:
            if e==N-2:
                if ans<e-s+2:
                    ans=e-s+2
                    break
        else :
            if ans<e-s+1:ans=e-s+1
            s=e+1
            e=s
            if e==N-2:
                break
            continue
        e+=1
    return ans

if __name__ == "__main__" :
    N = int(input())
    an = [a for a in map(int,input().split())]
    x,y=[0,1],[1,0]
    print(max(sol(0),sol(1)))

#No. 2477 by inthebleakmidwinter

if __name__ == "__main__" :
    K=int(input())
    l = [list(map(int,input().split()))[1] for _ in range(6)]
    w = l.index(max(l))
    h = l.index(max(l[(w-1)%6], l[(w+1)%6]))
    w_ = l.index(min(l[(h-1)%6], l[(h+1)%6]))
    h_ = l.index(min(l[(w-1)%6], l[(w+1)%6]))
    print(K*(l[w]*l[h]-(l[w]-l[w_])*(l[h]-l[h_])))

#No. 2527 by inthebleakmidwinter

def sol(x1,x2,x3,x4):
    xs = [[x1,'x1'], [x3,'x3'],[x2,'x2'],[x4,'x4']]
    xs.sort(key=lambda x:x[0])
    xsi = {}
    for i in range(4) :xsi[xs[i][1]]=i
    if xsi['x2']-xsi['x1']==1:
        if xsi['x1']==1:return 2
        else: return 0
    elif xsi['x2']-xsi['x1']==2:
        if xsi['x1']==0:
            if xs[xsi['x2']][0]-xs[xsi['x3']][0]+1>=2:return 2
            else:return 1
        else:
            if xs[xsi['x4']][0]-xs[xsi['x1']][0]+1>=2:return 2
            else:return 1
    else :return 2

if __name__ == "__main__" :
    ans=[]
    clf = [['x']*3 for _ in range(3)]
    for i in range(3):
        for j in range(3):
            if i==0 or j==0:clf[i][j]='d'
            elif i==1 and j==1:clf[i][j]='c'
            elif i+j==3:clf[i][j]='b'
            else:clf[i][j]='a'
    for _ in range(4):
        x1,y1,x2,y2,x3,y3,x4,y4=map(int, input().split())
        ans.append(clf[sol(x1,x2,x3,x4)][sol(y1,y2,y3,y4)])
    [print(a) for a in ans]

#No. 10157 by inthebleakmidwinter

if __name__ == "__main__" :
    C,R=map(int,input().split())
    K=int(input())
    vis=[[False]*C for _ in range(R)]
    dy,dx=[1,0,-1,0],[0,1,0,-1]
    k,d,r,c=1,0,0,0
    vis[0][0]=True
    while True:
        if C*R < K : 
            print(0)
            break
        if k==K:
            print(c+1,r+1)
            break
        if 0<=r+dy[d]<R and 0<=c+dx[d]<C and not vis[r+dy[d]][c+dx[d]]:
            r+=dy[d]
            c+=dx[d]
            vis[r][c]=True
            k+=1
        else:
            d=(d+1)%4

#No. 2669 by inthebleakmidwinter

if __name__ == "__main__" :
    vis=[[False]*100 for _ in range(100)]
    ans=0
    sq=[[i for i in map(int,input().split())] for _ in range(4)]
    for x1,y1,x2,y2 in sq:
        for x in range(x1,x2):
            for y in range(y1,y2):
                if not vis[x][y]:
                    vis[x][y]=True
                    ans+=1
    print(ans)

#No. 2635 by inthebleakmidwinter

if __name__ == "__main__" :
    F = int(input())
    ans=[F]
    for n in range(int(F/2)-1 if int(F/2)-1>0 else 1,F+1):
        tp,ct=[F,n],2
        while True:
            if tp[ct-2]-tp[ct-1]<0:break
            else :
                tp.append(tp[ct-2]-tp[ct-1])
                ct+=1
        if len(ans)<ct:ans=tp
    [print(len(ans)), print(' '.join(list(map(str,ans))))]

#No. 1244 by inthebleakmidwinter

if __name__ == "__main__" :
    S = int(input())
    st = list(map(int, input().split()))
    N = int(input())
    op = [[x for x in map(int,input().split())] for _ in range(N)]
    for n, m in op:
        if n==1:
            for i, s in enumerate(st):
                if (i+1)%m==0:
                    st[i] = (s+1)%2
        else:
            st[m-1]=(st[m-1]+1)%2
            for i in range(1,S):
                if m-1-i < 0 or m-1+i >= S:break
                if st[m-1-i]==st[m-1+i]:
                    st[m-1-i]=(st[m-1-i]+1)%2
                    st[m-1+i]=st[m-1-i]
                else :
                    break
    for i in range(S//20+1):
        print(' '.join(list(map(str,st))[20*i:20*(i+1)]))

#No. 2116 by inthebleakmidwinter
import sys
sys.setrecursionlimit(10**7)

def dfs(depth, pillar:list, up):
    global ans
    if depth==N:
        s=0
        for n in range(N):
            s+=max(pillar[n])
        if ans<s:ans=s
    else:
        down=dices[depth][rel[dices[depth].index(up)]]
        temp = dices[depth][:]
        temp.remove(up)
        temp.remove(down)
        pillar.append(temp)
        if depth>0:
            dfs(depth+1,pillar,down)
            return
        dfs(depth+1,pillar,up)

if __name__ == "__main__" :
    N=int(input())
    rel={0:5,1:3,2:4,3:1,4:2,5:0}
    ans=0
    dices=[[num for num in map(int,input().split())] for _ in range(N)]
    for n in dices[0]:
        dfs(0,[],n)
    print(ans)

#No. 2304 by inthebleakmidwinter

if __name__ == "__main__" :
    N=int(input())
    ps=dict([(i for i in map(int,input().split())) for _ in range(N)])
    ps=dict(sorted(ps.items()))
    ps_p=list(ps.keys())
    ps_l=list(ps.values())
    cur=ps_p[0]
    mx=ps_p[ps_l.index(max(ps_l))]
    ans=0
    for i,pos in enumerate(ps_p):
        if cur<pos<mx and ps[cur]<ps[pos]:
            ans+=(pos-cur)*ps[cur]
            cur=pos
        elif pos==mx:
            ans+=(pos-cur)*ps[cur]+ps[mx]
            cur=pos
        elif pos>cur and pos>mx:
            next_mx=ps_p[i:][ps_l[i:].index(max(ps_l[i:]))]
            if pos==next_mx:
                ans+=(pos-cur)*ps[next_mx]
                cur=pos
    print(ans)

#No. 2559 by inthebleakmidwinter

if __name__ == "__main__" :
    N,K=map(int,input().split())
    t=list(map(int,input().split()))
    mx=-10**7
    s=sum(t[:K])
    if mx<s:mx=s
    for i in range(N-K):
        s-=t[i]
        s+=t[i+K]
        if mx<s:mx=s
    print(mx)

#No. 13300 by inthebleakmidwinter

if __name__ == "__main__" :
    N,K=map(int,input().split())
    r=[[0]*7 for _ in range(2)]
    for _ in range(N):
        x,y=map(int,input().split())
        r[x][y]+=1
    ans=0
    for n in range(2):
        for m in range(1,7):
            ans+=r[n][m]//K+1 if r[n][m]%K else r[n][m]//K
    print(ans)
