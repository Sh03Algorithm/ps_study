import java.util.Arrays;
import java.util.Scanner;

public class Prob2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3]; //정수 배열 arr을 선언해주고 배열이 3임을 지정해준다.
        arr[0] = sc.nextInt();  //배열의 첫번째 숫자를 입력받는다.
        arr[1] = sc.nextInt();  //배열의 두번째 숫자를 입력받는다.
        arr[2] = sc.nextInt();  //배열의 세번째 숫자를 입력받는다.
        Arrays.sort(arr);       //배열을 오름차순으로 정렬한다.
        System.out.println(arr[0] + " " + arr[1]  + " " + arr[2]); //오름차순으로 재 정렬된 숫자를 순서대로 출력해준다.
    }
}
