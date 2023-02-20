import java.util.Scanner;

public class Hiss {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String i = input.nextLine();
        if (i.contains("ss"))
            System.out.println("hiss");
        else
            System.out.println("no hiss");
    }
}
