import java.io.*;
import java.util.*;

public class B_2606_신정인{

    static int answer=0;
    static int[][] data;
    static boolean[] visited;
    static int n;

    public static void main(String[] args) throws Exception{

        //컴퓨터 수, 컴퓨터 쌍 수 입력받기
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());

        //연결된 컴퓨터 번호 쌍 입력받기
        data=new int[n+1][n+1];
        for(int i=0;i<m;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            data[a][b]=1;
            data[b][a]=1;
        }

        //감염된 컴퓨터 확인 배열
        visited=new boolean[n+1];

        dfs(1);
        //1번 컴퓨터 제외한 감염 컴퓨터 개수
        System.out.println(answer-1);
    }

    public static void dfs(int v){
        visited[v]=true;
        answer+=1;
        for(int i=0;i<=n;i++){
            if(data[v][i]==1 && visited[i]==false){
                dfs(i);
            }
        }
    }
}