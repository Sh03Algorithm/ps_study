import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int T = sc.nextInt(); 

        int count = -1;   
        int min = 10000000; 
        int sum = 0;      

        for (int i = 0; i < N; i++) {
            int si = sc.nextInt();
            int li = sc.nextInt(); 
            int ci = sc.nextInt(); 

            sum = si;

        
            for (int j = 0; j < ci; j++) {
                if (T <= sum) {
                    
                    count = sum - T;
                    break;  
                }
                
                sum += li;
            }

            if (count <= min && count != -1) {
                min = count;
            }
        }

        if (count == -1) {
            System.out.print(count); 
        } else {
            System.out.print(min); 
        }
    }
}
