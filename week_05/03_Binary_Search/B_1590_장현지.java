package week05;

import java.util.Scanner;

public class B1590 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int count = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0; i < n; i++) {
            int si = sc.nextInt();
            int li = sc.nextInt();
            int ci = sc.nextInt();
            sum = si;
            for(int j=0; j< ci; j++) {
                if(t <= sum) {
                    count = sum-t;
                    break;
                }
                sum += li;
            }
            if(count <= min && count != -1) min = count;
        }
        if(count==-1) System.out.println(count);
        else System.out.println(min);
    }

}
