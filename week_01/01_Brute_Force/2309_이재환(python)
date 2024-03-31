#No. 2309 by inthebleakmidwinter

def sol(dwarfs) :
    for f in range(9) :
        for s in range(f+1, 9) :
            if sum(dwarfs)-dwarfs[f]-dwarfs[s] == 100 :
                dwarfs.pop(f)
                dwarfs.pop(s-1)
                return [print(dwarf) for dwarf in sorted(dwarfs)]

if __name__ == "__main__" :
    sol([int(input()) for _ in range(9)])
