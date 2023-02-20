import java.util.Scanner;

public class ColdPuter {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int c =0;
        int x = input.nextInt();
        for (int i = 1; i <=x ; i++) {
            int temp = input.nextInt();
            if (temp < 0)
                c++;
        }
        System.out.println(c);
    }
}
