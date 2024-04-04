import java.util.Scanner;

public class prob2231_신정인{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int answer=0;

        for(int i=1;i<n;i++){
            int total=0;
            int temp=i;
            total+=temp;
            while(temp!=0){
                total+=temp%10;
                temp/=10;
            }
            if(total==n){
                answer=i;
                break;
            }
        }
        System.out.println(answer);
    }
}