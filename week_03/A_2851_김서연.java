import java.io.IOException;
import java.util.Scanner;

public class A_2851_김서연 {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        arr[0]=0;
        int sum=0;
        // 누적합 배열을 만들어준다.
        for(int i=1;i<11;i++){
            arr[i]=arr[i-1]+sc.nextInt();
        }
        //누적합 배열을 이용해서 구간합별로 sum을 업데이트 해준다.
        for(int i=1;i<11;i++){
            //100일경우 100 출력
            if(arr[i]==100){
                sum=100;
                break;
            } 
            // 100 이상일 경우 100에 가장 가까운 수를 출력한다.차이가 같은 경우 큰 수 출력
            else if(arr[i]>100){
                if((arr[i]-100) == (100-arr[i-1])){
                    sum=arr[i];
                    break;
                }else{
                   sum= (arr[i]-100 > 100-arr[i-1]) ? arr[i-1] : arr[i];
                    break;
                } 
            }
        }
        // 합이 100을 넘지 않을 경우 마지막 합배열을 출력
        if(sum==0) sum=arr[10];
        System.out.println(sum);

    }
}
