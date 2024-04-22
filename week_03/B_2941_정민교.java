import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		String[] croatias = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		int idx = 0;
		int cnt = 0;
		while (idx < str.length()) {
			for (String croatia : croatias) {
				if (croatia.length() <= str.length() - idx) {
					String substr = str.substring(idx, idx + croatia.length());
					if (croatia.equals(substr)) {
						idx += croatia.length() - 1;
						break;
					}
				}
			}
			idx++;
			cnt++;
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) throws Exception {
		new Main().Solution();
	}
}