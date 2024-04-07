import java.io.*;
import java.util.*;

public class B_11660_신정인{
    public static void main(String[] args) throws Exception{

        //n,m 입력받기
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        //n*n 입력받기
        int[][] a=new int[n+1][n+1];
        for(int i=1;i<n+1;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<n+1;j++){
                a[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        //누적합 테이블 만들기
        int[][] data=new int[n+1][n+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                data[i][j]=a[i][j]+data[i][j-1]+data[i-1][j]-data[i-1][j-1];
            }
        }

        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int x1=Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());
            int answer=data[x2][y2]-data[x2][y1-1]-data[x1-1][y2]+data[x1-1][y1-1];
            System.out.println(answer);
        }
    }
}