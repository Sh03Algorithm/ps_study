// solution - mem: 16024KB, time : 152ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()),a=1,b=0;
        for(int i=0;i<k;i++) {
            int temp=a;
            a=b;b=temp+b;
        }
        System.out.println(a+" "+b);
    }
}
