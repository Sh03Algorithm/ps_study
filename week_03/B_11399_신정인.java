import java.io.*;
import java.util.*;

public class B_11399_신정인{
    public static void main(String[] args) throws Exception{

        int total=0;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        int[] data=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            data[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(data);

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                total+=data[j];
            }
        }

        /*int prev=0;
        for(int i=0;i<n;i++){
            prev+=data[i];
            total+=prev;
        }*/

        System.out.println(total);

    }
}