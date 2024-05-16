import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int acc=0;
        ArrayList<Integer> dis = new ArrayList<>();
        dis.add(0);
        for(int i=0;i<n;i++) {
            acc+=Integer.parseInt(br.readLine());
            dis.add(acc);
        }
        int mx=0, s=0, e=0, tmp;
        while(s<n && e<n) {
            tmp=dis.get(e)-dis.get(s)>dis.get(n)-dis.get(e)+dis.get(s)?dis.get(n)-dis.get(e)+dis.get(s):dis.get(e)-dis.get(s);
            if(mx<tmp) mx=tmp;
            if(dis.get(e)-dis.get(s)<dis.get(n)-dis.get(e)+dis.get(s)) e++;
            else s++;
        }
        System.out.println(mx);
    }
}
