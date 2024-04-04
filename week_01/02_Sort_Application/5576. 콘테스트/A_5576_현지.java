import java.util.ArrayList;
import java.util.Scanner;

public class B5576_현지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> W = new ArrayList<>();
        ArrayList<Integer> K = new ArrayList<>();

        for(int i=0; i < 10; i++)
            W.add(sc.nextInt());
        for(int i=0; i < 10; i++)
            K.add(sc.nextInt());

        W.sort((a,b) -> b-a);
        K.sort((a,b) -> b-a);

        int wScore = W.get(0) + W.get(1) + W.get(2);
        int kScore = K.get(0) + K.get(1) + K.get(2);

        System.out.println(wScore +" " + kScore);

    }
}
