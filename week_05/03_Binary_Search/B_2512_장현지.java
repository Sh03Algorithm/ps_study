package week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int index = 0;
        int min = 0;
        int max = Integer.MIN_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            int tmp = Integer.parseInt(st.nextToken());
            arr[index++] = tmp;
            max = Math.max(max, tmp);
        }
        int m = Integer.parseInt(br.readLine());
        
        while(min <= max) {
            int mid = (min + max) / 2;
            int total = 0;
            for(int a:arr) {
                if(a > mid) total += mid;
                else total += a;
            }

            if(total <= m) min = mid+1;
            else max = mid-1;
        }

        // 왜 max?
        System.out.println(max);
    }
}
