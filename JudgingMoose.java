import java.util.Scanner;

public class JudgingMoose {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();

        if (i+j != 0) {
            if (i ==j){
                System.out.println("Even " + (i+j));
            }
            else
                System.out.println("Odd " + (Math.max(i+i,j+j)));
        }
        else {
            System.out.println("Not a moose");
        }
    }
}
