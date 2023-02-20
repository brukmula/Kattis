import java.util.ArrayList;
import java.util.Scanner;

public class FreeFood {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i <n; i++) {
            int first = input.nextInt();
            int second = input.nextInt();
            for (int j = first; j <=second; j++) {
                if (!list.contains(j)){
                    list.add(j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
