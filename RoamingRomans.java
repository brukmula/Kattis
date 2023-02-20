import java.util.Scanner;

public class RoamingRomans {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        double i = input.nextDouble();
        System.out.println((int)(Math.round(i *1000.0 * (5280.0/4854.0))));
    }
}
