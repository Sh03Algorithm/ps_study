
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2635 {
	static int subCnt = 1;
	// static int subIndex = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(n);
		ArrayList<Integer> b = new ArrayList<Integer>();

		int maxCnt = 0, maxLength = 0;
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			a.add(n);
			int subIndex = i;
			// arr[subIndex].add(n);
			calc(n, i + 1, subIndex, a);
			// maxIndex = subCnt > maxCnt ? subIndex : maxIndex;
			maxCnt = subCnt > maxCnt ? subCnt : maxCnt;

			subCnt = 0;
			arr.add(a);
			//System.out.println("a 사이즈는" + a.size());
			if (a.size() > maxLength) {
				b = a;
				maxLength = a.size();
			}		
		}
		
		System.out.println(b.size());
		for(Integer data : b) {
			System.out.print( data + " ");
		}
	}

	public static int calc(int n, int i, int subIndex, ArrayList<Integer> a) {

		if (i < 0) {
			return 0;
		} else {
			a.add(i);
			subCnt++;
			return calc(i, n - i, subIndex, a);
		}

	}
}
