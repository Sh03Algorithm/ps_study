
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(sugar(N));
	}

	public static int sugar(int N) {
		
		int cnt = 0;
		
		for(int i=N/5; i>=0; i--) {
			for (int j=N/3; j>=0; j--) {
				if((5*i + 3*j)== N) {
					cnt = i + j;
					return cnt;
				}
			}
		}
		cnt = cnt>0 ? cnt : -1;
		
		return cnt;
	}
}
