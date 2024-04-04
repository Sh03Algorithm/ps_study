#No. 1018 by inthebleakmidwinter

if __name__ == "__main__" :
    N, M = map(int, input().split())
    board, ans = [list(input()) for _ in range(N)], 64
    for n in range(N-7) :
        for m in range(M-7) :
            ans1, ans2 = 0, 0
            for n_ in range(n, n+8) :
                for m_ in range(m, m+8) :
                    if n_%2 ==  m_%2 and board[n_][m_] == 'B' :
                        ans1+=1
                    elif n_%2 != m_%2 and board[n_][m_] == 'W' :
                        ans1+=1
                    if n_%2 == m_%2 and board[n_][m_] == 'W' :
                        ans2+=1
                    elif n_%2 != m_%2 and board[n_][m_] == 'B' :
                        ans2+=1
            if ans > min(ans1, ans2) : ans = min(ans1, ans2)
    print(ans)
