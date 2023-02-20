import java.util.Scanner;

public class Faktor {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        double articles = input.nextInt();
        double impact = input.nextInt();
        impact--;
        System.out.println((int)(articles*impact+1));
    }
}
