import java.util.Scanner;

public class IsItHalloween {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        if (line.equals("OCT 31") || line.equals("DEC 25"))
            System.out.println("yup");
        else
            System.out.println("nope");
    }
}
