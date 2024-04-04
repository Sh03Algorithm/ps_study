#No. 9625 by inthebleakmidwinter - mem : 31120KB, time : 40ms

K, mch = int(input()), [[1,0],[0,1]]
for _ in range(K-1) : 
    mch.append([mch[-1][0]+mch[-2][0],
                mch.pop(0)[1]+mch[-1][1]])
print(mch[-1][0], mch[-1][1])
