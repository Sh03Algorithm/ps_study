import java.util.Scanner;

public class prob1072_신정인{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] data=sc.nextLine().split(" ");

        int x=Integer.parseInt(data[0]);
        int y=Integer.parseInt(data[1]);
        int z=(int)((long)y*100/x);

        int answer=-1;
        int start=0;
        int end=(int)1e9;

        while(start<=end){
            int mid=(start+end)/2;
            if((int)((long)(y+mid)*100/(x+mid))!=z){
                answer=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println(answer);
    }
}