import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//문제분석 :
//섬과 바다가 있는 지도가 주어지고 섬의 개수를 세어야함
//한 정사각형과 가로,세로,대각선으로 연결되어 있으면 이어진 섬으로 인식
//지도의 너비(w)와 높이(h)를 입력하고 1은 땅,0은 바다로 지도를 입력한다. 0 0은 종료
//섬의 개수를 출력한다.

//설명 :
//섬을 배열에 입력받고 0,0좌표부터 땅을 탐색하면서 아직 방문하지 않은 땅이 있으면 방문한다.
//방문한 땅과 같은 섬인 다른 땅을 탐색한다.
//방문하지 않았으며 현재 땅에서 갈 수 있는 땅이라면 이동하여 방문처리하고 이동한 땅에서 또 이동할 수 있는 땅이 있는지 확인하며 섬 하나를 카운팅한다.
//위 과정을 반복하면서 섬의 갯수를 구한다.

public class A_4963_김서연 {
    public static int w, h, count; //지도의 너비와 높이, 섬의개수
    public static boolean[][] land;
    public static boolean[][] visited;
    static int[] xMove = {0, 0, -1, 1, 1, 1, -1, -1};
    static int[] yMove = {-1, 1, 0, 0, 1, -1, 1, -1};
    //상하좌우,대각선 방향 정의
    //예를 들어 현재 x,y가 0,0일 때 xMove[0],yMove[0]을 더하면 현재칸의 한칸 아래에 있는 칸이다.
    //즉 0~8까지 다 더하면 x,y의 상하좌우 대각선들에 있는 땅의 위치를 알 수 있다.
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] split = br.readLine().split(" ");
            w = Integer.parseInt(split[0]);
            h = Integer.parseInt(split[1]);
            if (w == 0 && h == 0) break; //0,0 일때 break

            visited = new boolean[h][w];
            land = new boolean[h][w];
            count = 0;
            for (int i = 0; i < h; i++) {
                String[] split1 = br.readLine().split(" ");
                for (int j = 0; j < w; j++) {
                    int num = Integer.parseInt(split1[j]);
                    if (num == 1) {
                        land[i][j] = true;
                    } else land[i][j] = false;
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    // 땅이며 아직 방문하지 않은 땅이면 탐색 시작
                    if (land[i][j] && !visited[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }


            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int x, int y) {
        // 방문 처리
        visited[x][y] = true;

        // 나의 상하좌우 대각선 다 살피기
        for (int i = 0; i < 8; i++) {
            int newX = x + xMove[i];
            int newY = y + yMove[i];
            // 주어진 칸 안에 있는 곳 일때
            if (newX >= 0 && newX < h) {
                if (newY >= 0 && newY < w) {
                    // 탐색하는 칸이 땅이며 아직 방문하지 않은 곳이라면
                    if (land[newX][newY] && !visited[newX][newY]) {
                        dfs(newX, newY);
                    }
                }
            }
        }
    }
}
