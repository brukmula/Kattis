import java.util.Scanner;

public class HangingOutTerrace {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int count=0;
        int terrace = 0;
        int limit = input.nextInt();
        int events = input.nextInt();
        for (int i = 1; i <= events ; i++) {
            String word = input.next();
            int people = input.nextInt();
            if (word.equals("enter")){
                if (terrace+people <= limit)
                    terrace += people;
                else
                    count++;
            }
            else{
                terrace -= people;
            }
        }
        System.out.println(count);
    }
}
