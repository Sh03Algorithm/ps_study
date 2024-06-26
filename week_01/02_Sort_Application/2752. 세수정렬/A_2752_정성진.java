import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 3; i++) {
            sb.append(array[i]).append(" ");
        }

        System.out.println(sb);
    }
}