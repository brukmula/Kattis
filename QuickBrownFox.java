import java.util.Scanner;

public class QuickBrownFox {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        input.nextLine();
        int count;
        String missing;
        for (int i = 0; i <n ; i++) {
            missing = "";
            count = 0;
            String line = input.nextLine().toLowerCase();
            for (char letter = 'a'; letter <= 'z'; letter++){
                if (line.contains(Character.toString(letter))){
                    count++;
                }
                else missing = missing.concat(Character.toString(letter));
            }
            if(count >= 26){
                System.out.println("pangram");
            }
            else System.out.println("missing " + missing);
        }

    }
}
