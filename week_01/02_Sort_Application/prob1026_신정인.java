import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class prob1026_신정인{
    public static void main(String[] args){
        int answer=0;

        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] aString=sc.nextLine().split(" ");
        String[] bString=sc.nextLine().split(" ");
        Integer[] A=new Integer[n];
        Integer[] B=new Integer[n];
        for(int i=0;i<n;i++){
            A[i]=Integer.parseInt(aString[i]);
            B[i]=Integer.parseInt(bString[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        for(int i=0;i<n;i++){
            answer+=A[i]*B[i];
        }
        System.out.println(answer);
    }
}