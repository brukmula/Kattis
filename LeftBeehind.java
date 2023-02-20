import java.util.Scanner;

public class LeftBeehind {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);


        while(true){
            int first = input.nextInt();
            int second = input.nextInt();

            if (first == 0 && second == 0)
                break;

            if (first + second == 13) System.out.println("Never speak again.");
            else if (first > second) System.out.println("To the convention.");
            else if (first == second) System.out.println("Undecided.");
            else System.out.println("Left beehind.");
        }
    }
}
