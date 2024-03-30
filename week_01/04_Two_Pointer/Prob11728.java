import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken()); //첫번째 배열길이
        int n2 = Integer.parseInt(st.nextToken()); //두번째 배열길이
        int[] arr = new int[n1+n2]; //정렬할 배열

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n1 ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i <n2 ; i++){
            arr[i+n1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); //정렬

        StringBuilder sb = new StringBuilder();

        for(int su:arr){
            sb.append(su+" ");
        }
        System.out.println(sb);

    }
}
