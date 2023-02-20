import java.util.Scanner;

public class SimonSays {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        for (int i = 1; i <=cases+1 ; i++) {
            String s = input.nextLine();
            if (s.contains("Simon says"))
                System.out.println(s.substring(s.lastIndexOf("Simon says")+10));
        }
    }
}
