import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int result;
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= T; tc++) {
            String str = br.readLine();
            result = 2;
            check(str, 0, str.length() - 1, 1);
            bw.write(result + "\n");
        }
        bw.close();
    }

    private static void check(String str, int start, int end, int joker) { 
        if(start >= end) {
            if(joker == 1) {
                result = 0;
                return;
            }

            result = 1;
            return;
        }
 
        if(str.charAt(start) == str.charAt(end)) {
            check(str, start + 1, end - 1, joker);
            return;
        }
 
        if(joker == 0) {
            return;
        }
 
        check(str, start + 1, end, 0);
        check(str, start, end - 1, 0);
    }

}
