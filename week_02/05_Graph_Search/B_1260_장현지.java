import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_1260_장현지 {

    static boolean[][] graph;
    static int N, M, V;

    static Queue<Integer> q = new LinkedList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = true;
        }

        dfs(V);
        System.out.println();
        bfs(V);

    }

    private static void dfs(int node) {


        visited[node] = true;
        System.out.print(node + " ");

        for(int i=1; i <= N; i++) {
            if(!visited[i] && graph[node][i]) dfs(i);
        }

    }

    private static void bfs(int node) {
        visited = new boolean[N+1];

        q.add(node);
        visited[node] = true;

        while(!q.isEmpty()) {
            node = q.poll();
            System.out.print(node + " ");

            for(int i=1; i <= N; i++) {
                if(!visited[i] && graph[node][i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

}
