import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1012_장현지 {
    static int M, N, K;
    static boolean[][] farm;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        int tc = 0;
        while(tc++ != T) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            farm = new boolean[N][M];
            int result = 0;
            for(int i=0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int tmpX = Integer.parseInt(st.nextToken());
                int tmpY = Integer.parseInt(st.nextToken());

                farm[tmpY][tmpX] = true;
            }

            for(int y=0; y < N; y++) {
                for(int x=0; x < M; x++) {
                    if(farm[y][x]) {
                        result++;
                        dfs(x, y);
                    }
                }
            }

            System.out.println(result);

        }
        br.close();
    }

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    private static void dfs(int x, int y) {
        for(int k=0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if(nx < 0 || nx >= M || ny < 0 || ny >= N || !farm[ny][nx])
                continue;

            farm[ny][nx] = false;

            dfs(nx, ny);

        }

    }


}
