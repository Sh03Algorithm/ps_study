

//문제 분석 :
//상근이가 가장 적은 종류의 비행기를 타고 여행 할 수 있도록 하는 문제
//이미 방문한 국가여도 다른국가로 이동할 때 거쳐갈 수 있다.
//최소신장트리 이용 (신장트리 : 무방향 그래프에서 모든 정점을 지나고 사이클을 형성하지 않는 것
//이미 방문한 국가여도 거쳐갈 수 있다고 했긴 한데 어차피 가장 적은 종류의 비행기를 타려면 그래프 내부에 여러 사이클을 형성할 필요가 없음.
//최소 신장 트리의 성질 - 간선의 개수 = 정점의 개수-1
//즉 모든 국가가 연결되어 있기 때문에 비행기 종류의 최소 개수는 국가 수 -1
//국가가 정점 - 비행기가 간선

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A_9372_김서연 {
    static int N, M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());//테스트케이스

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken()); //국가수
            M = Integer.parseInt(st.nextToken()); //비행기종류

            for (int i = 0; i < M; i++) {
                br.readLine();
            }
            sb.append((N-1) + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
