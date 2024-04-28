import java.io.*;
import java.util.*;

public class A_2559_신정인{
    public static void main(String[] args) throws Exception{
        int answer=Integer.MIN_VALUE;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //n, k 입력
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        //온도 수열 입력
        int[] t=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            t[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=t[j];
            }
            if(answer<sum){
                answer=sum;
            }
        }

        System.out.println(answer);
    }
}
//------------------------------------------------------------------------------------------------------
//누적합
import java.io.*;
        import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        int answer=Integer.MIN_VALUE;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //n, k 입력
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        int[] t=new int[n+1];
        st=new StringTokenizer(br.readLine());
        //누적합 구하기
        for(int i=1;i<=n;i++){
            t[i]=t[i-1]+Integer.parseInt(st.nextToken());
        }

        //k개 합 비교
        for(int i=k;i<=n;i++){
            int sum=t[i]-t[i-k];
            if(sum>answer){
                answer=sum;
            }
        }

        System.out.println(answer);
    }
}

//------------------------------------------------------------------------------------------------------
//투 포인터
import java.io.*;
        import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //n, k 입력
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        //온도 수열 입력
        int[] t=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            t[i]=Integer.parseInt(st.nextToken());
        }

        int sum=0;

        //최초 k개 합
        for(int i=0;i<k;i++){
            sum+=t[i];
        }

        int answer=sum;

        int ptr1=0;
        int ptr2=k;

        while(ptr2<=n-1){
            sum-=t[ptr1++];
            sum+=t[ptr2++];
            if(sum>answer){
                answer=sum;
            }
        }

        System.out.println(answer);
    }
}