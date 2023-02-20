import java.util.Scanner;

public class QuickEstimates {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        for (int j = 1; j <= i ; j++) {
            String num = input.next();
            System.out.println(num.length());
        }
    }
}
