import java.util.Scanner;

public class SodaSlurper {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int e= input.nextInt();
        int f = input.nextInt();
        int c = input.nextInt();
        int sum = 0;
        e+=f;
        while (e>=c){
            int newSoda = e/c, empty = e%c;
            sum+= newSoda;
            e = newSoda + empty;
        }
        System.out.println(sum);
    }
}
