import java.util.Scanner;

public class Tarifa {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int X = input.nextInt(), N = input.nextInt(), left = 0;
        for (int i = 1; i <=N ; i++) {
         int num = input.nextInt();
         left+= num;
        }
        System.out.println((X*N) - left + X);
    }
}
