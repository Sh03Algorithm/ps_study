// solution1 - Mem : 57200KB, time : 1552ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static class Member {
        int age;String name;
        public Member(int age, String name) {
            this.age=age;this.name=name;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Member> list = new ArrayList<>();
        StringTokenizer st;
        for(int i=0;i<n;i++) {
            st=new StringTokenizer(br.readLine());
            list.add(new Member(Integer.parseInt(st.nextToken()),
            st.nextToken()));
        }
        Collections.sort(list, (o1,o2)->o1.age-o2.age);
        for(Member mem:list) {
            System.out.println(mem.age+" "+mem.name);
        }
    }
}

// solution2(by TreeMap) - Mem : 58328KB, time: 2204ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    static class Member implements Comparable<Member> {
        int age;String name;int num;
        public Member(int age, String name, int num) {
            this.age=age;this.name=name;this.num=num;
        }
        @Override
        public int compareTo(Member m) {
            if(age==m.age) {
                return num-m.num;
            }
            return age-m.age;
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeMap<Member, Integer> treeMap = new TreeMap<>();
        StringTokenizer st;
        for(int i=0;i<n;i++) {
            st=new StringTokenizer(br.readLine());
            treeMap.put(
                new Member(Integer.parseInt(st.nextToken()),
                 st.nextToken(), i),
                 i);
        }
        for(Member mem:treeMap.keySet()) {
            System.out.println(mem.age+" "+mem.name);
        }
    }
}
