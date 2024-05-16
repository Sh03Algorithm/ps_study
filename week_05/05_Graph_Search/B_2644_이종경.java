import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static List<Integer>[] relation;
	static boolean[] checked;
	static int res = -1;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		relation = new ArrayList[n+1];
		checked = new boolean[n+1];
		for(int i=1; i<n+1; i++) {
			relation[i] = new ArrayList<>();
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int l = Integer.parseInt(br.readLine());
		
		for(int i=0; i<l; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			relation[p].add(c);
			relation[c].add(p);
      //부모에서 자식으로 촌수를 연결할 수 있고, 자식에서 부모로 촌수 과정을 계산할 수 있다.
		}
		
		dfs(x,y, 0); //비교할 두 수를 DFS방식으로 탐색
		System.out.println(res);
	}
	
	static void dfs(int start, int end, int cnt) {
		if(start == end) { //탐색이 끝난 경우
			res = cnt;
			return; 
		}
		
		checked[start] = true; //해당 노드를 check처리 
		for(int i=0; i<relation[start].size(); i++) { 
			int next = relation[start].get(i);
			if(!checked[next]) {
        
				dfs(next, end, cnt+1);
			}
		}
	}
}
