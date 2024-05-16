import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 노드 개수 입력

		// 트리 구조 표현을 위한 그래프 구현
		ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
		for (int i = 0; i < n; i++)
			tree.add(new ArrayList<>());

		// 그래프 입력
		for (int i = 0; i < n - 1; i++) {
			int n1 = sc.nextInt() - 1;
			int n2 = sc.nextInt() - 1;
			tree.get(n1).add(n2);
			tree.get(n2).add(n1);
		}

		boolean[] visited = new boolean[n]; // 방문 여부 확인용 배열
		int[] parentNode = new int[n]; // 부모 노드 저장 배열

        // BFS
        Queue<Integer> queue = new LinkedList<>(); // BFS를 위한 큐 생성
        queue.add(0); // 시작 노드(여기서는 0번 노드)를 큐에 추가
        visited[0] = true; // 시작 노드를 방문했음을 표시

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            int v = queue.remove(); // 큐에서 노드를 하나 꺼내어 현재 방문하는 노드로 설정
    
            // 현재 노드의 인접 노드들에 대해 반복
            for (int node : tree.get(v)) {
                // 인접 노드가 방문되지 않았다면
                   if (!visited[node]) {
                        visited[node] = true; // 해당 노드를 방문했음을 표시
                        queue.add(node); // 방문하지 않은 인접 노드를 큐에 추가
                        parentNode[node] = v; // 부모 노드 찾은 후 저장
                    }
            }
        }


		// 루트 노드를 제외한 나머지 노드의 부모 노드 출력
		for (int i = 1; i < n; i++)
			System.out.println(parentNode[i] + 1);
	    }

}

//https://velog.io/@darak/BJ-11725-%ED%8A%B8%EB%A6%AC%EC%9D%98-%EB%B6%80%EB%AA%A8-%EC%B0%BE%EA%B8%B0-Java
