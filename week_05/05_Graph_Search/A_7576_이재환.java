import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        int[][] s = new int[n][m];
        int n0=0;
        ArrayList<int[]> act = new ArrayList<>();
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++) {
                s[i][j] = Integer.parseInt(st.nextToken());
                if(s[i][j]==0) n0++;
                else if(s[i][j]==1) act.add(new int[] {i,j});
            }
        }
        int[] dy = {-1,1,0,0}, dx = {0,0,-1,1};
        int t=0;
        ArrayList<int[]> temp;
        while(true) {
            temp = new ArrayList<>();
            for(int[] k:act) {
                for(int d=0;d<4;d++) {
                    if(0<=k[0]+dy[d] && k[0]+dy[d]<n && 0<=k[1]+dx[d] && k[1]+dx[d] <m) {
                        if(s[k[0]+dy[d]][k[1]+dx[d]]==0) {
                            s[k[0]+dy[d]][k[1]+dx[d]]=1;
                            temp.add(new int[] {k[0]+dy[d], k[1]+dx[d]});
                            n0--;
                        }
                    }
                }
            }
            if(temp.size()!=0) {
                t++;
                act=temp;
            } else {
                if(n0!=0) t=-1;
                break;
            }
        }
        System.out.println(t);
    }
}
