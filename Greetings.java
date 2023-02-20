import java.util.Scanner;

public class Greetings {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int count =0;
        String w= input.next();
        for (int i = 0; i <w.length() ; i++) {
            if (w.charAt(i) == 'e')
                count++;
        }
        System.out.print("h");
        for (int i = 0; i <count*2 ; i++) {
            System.out.print("e");
        }
        System.out.print("y");
    }
}
