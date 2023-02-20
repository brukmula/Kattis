import java.util.Scanner;

public class Ladder {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int height = input.nextInt();
        int angle = input.nextInt();
        int l = (int) Math.ceil(height/Math.sin(Math.toRadians(angle)));
        System.out.println(l);
    }
}
