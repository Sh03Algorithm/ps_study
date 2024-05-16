import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		int left = 0;
		int right = -1;
		//나무 n개 중 최대 나무길이
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			right = Math.max(right, arr[i]);
		}
		
		while(left<=right) {
			int mid = (left+right)/2;
			long tree=0;
			for(int i=0; i<n; i++) {
				 //나무 자르기
				if(arr[i]>mid) tree+= arr[i]-mid;
			}
			if(tree>=m) {		//너무 많이 자름
				left = mid+1;
			}else if(tree<m) { 	//나무가 부족함
				right = mid-1;
			}
		}
		
		System.out.println(right);
	}
}
