#No. 5576 by inthebleakmidwinter

if __name__ == "__main__" :
    s = [[int(input()) for _ in range(10)] for _ in range(2)]
    print(s[0].pop(s[0].index(max(s[0])))+
          s[0].pop(s[0].index(max(s[0])))+
          s[0].pop(s[0].index(max(s[0])))
          , s[1].pop(s[1].index(max(s[1])))+
          s[1].pop(s[1].index(max(s[1])))+
          s[1].pop(s[1].index(max(s[1]))))
