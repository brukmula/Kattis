import java.util.Scanner;

public class FYI {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String number = input.next();

        if (number.startsWith("555"))
            System.out.println(1);
        else System.out.println(0);
    }
}
