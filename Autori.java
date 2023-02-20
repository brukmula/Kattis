import java.util.Scanner;

public class Autori {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        String name = input.next();
        String out = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '-')
                out += name.charAt(i+1);
        }
        System.out.println(name.charAt(0) + "" + out);
    }
}
