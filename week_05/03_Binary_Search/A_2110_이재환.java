import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        int[] h = new int[n];
        for(int i=0;i<n;i++) {
            h[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(h);

        int left=1, right=h[n-1]-h[0];
        int mid, sch, pre, num;
        while(left<=right) {
            mid = (left+right)/2;
            sch=0;pre=0;num=0;
            while(sch<n) {
                while(h[sch]-h[pre] < mid) {
                    sch++;
                    if(sch>=n) break;
                }
                num++;
                pre=sch;
            }
            if(num>=c) left = mid+1;
            else right = mid-1;
        }
        System.out.println(right);
    }
}
