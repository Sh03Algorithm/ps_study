import java.util.*;
import java.io.*;

public class Main{
    static int [][] bingo;
    static int count;
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        bingo = new int[5][5];
        count = 0;
        
        //주어진 빙고판
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                bingo[i][j] = scan.nextInt();
            }
        }
        
        for(int k=1; k<=25; k++){
            int num = scan.nextInt();
            
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    if(bingo[i][j] == num)
                        bingo[i][j] = 0;
                }
            }
            
            rCheck();
            lCheck();
            lrCheck();
            rlCheck();
            
            if(count >= 3){
                System.out.println(k);
                break;
            }
            count = 0;
        }
    }
    
    //가로체크
    public static void rCheck(){
        for(int i=0; i<5; i++){
            int zeroCount = 0;
            for(int j=0; j<5; j++){
                if(bingo[i][j]==0)
                    zeroCount++;
            }if(zeroCount==5)
                count++;
        }
    }
    
    //세로체크
    public static void lCheck(){
        for(int i=0; i<5; i++){
            int zeroCount = 0;
            for(int j=0; j<5; j++){
                if(bingo[j][i]==0)
                    zeroCount++;
            }if(zeroCount==5)
                count++;
        }
    }
    
    //왼쪽-오른쪽 대각선체크
        public static void lrCheck(){
            int zeroCount = 0;
            for(int i=0; i<5; i++){
                if(bingo[i][i]==0)
                    zeroCount++;
            }
            if(zeroCount==5)
                count++;
        }
    
    
    //오른쪽-왼쪽 대각선체크
        public static void rlCheck(){
            int zeroCount = 0;
            for(int i=0; i<5; i++){
                if(bingo[i][4-i]==0)
                    zeroCount++;
            }
            if(zeroCount==5)
                count++;
        }
     
}
