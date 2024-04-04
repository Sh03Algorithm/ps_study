import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class B10814_현지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] users = new String[N][2];

        for(int i=0; i < N; i++) {
            String[] lines = br.readLine().split(" ");
            users[i][0] = lines[0];
            users[i][1] = lines[1];
        }

        Arrays.sort(users, (a, b) -> {
            return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
        });

        for(String[] user:users)
            System.out.println(user[0] + " " + user[1]);

    }
}
