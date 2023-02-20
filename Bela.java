import java.util.Scanner;

public class Bela {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int set = input.nextInt();
        String let = input.next();
        for (int i = 1; i <= set*4 ; i++) {
            String card = input.next();
            char type = card.charAt(0);
            char suit = card.charAt(1);

        }
    }
}
