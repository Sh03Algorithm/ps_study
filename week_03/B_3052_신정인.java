import java.io.*;
import java.util.*;

public class B_3052_신정인{
    public static void main(String[] args) throws Exception{

        Set<Integer> set=new HashSet<>();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<10;i++){
            int data=Integer.parseInt(br.readLine()); //입력값
            int num=data%42; //나머지값
            set.add(num);
        }

        System.out.println(set.size());
    }
}