import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] sortedArr = arr.clone(); 
        Arrays.sort(sortedArr);

        Map<Integer, Integer> indexMap = new HashMap<>();
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (!indexMap.containsKey(sortedArr[i])) {
                indexMap.put(sortedArr[i], index++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int value = indexMap.get(arr[i]);
            sb.append(value).append(" ");
        }
        System.out.println(sb);
    }
}
