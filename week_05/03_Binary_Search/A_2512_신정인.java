import java.io.*;
import java.util.*;

public class A_2512_신정인{
    public static void main(String[] args) throws Exception{

        //입력받는 부분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] datas=new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            datas[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        //
        
        //배열 오름차순 정렬
        Arrays.sort(datas);

        int left = 0;
        int right = datas[n-1];

        //상한액 찾기
        while(left<=right){
            int mid = (left+right)/2;
            int total = 0;
            for(int i=0;i<n;i++){
                if(datas[i]<=mid){
                    total+=datas[i];
                }
                else{
                    total+=mid;
                }
            }
            if(total<=m){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(right);
    }
}