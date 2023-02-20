import java.util.Scanner;

public class R2 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int mean = input.nextInt();
        System.out.println(2*mean - first);
    }
}
