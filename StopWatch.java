import java.util.Scanner;

public class StopWatch {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int time = 0;

        if (n %2 != 0) System.out.println("still running");

        else {
            for (int i = 0; i < n/2; i++) {
                int first = input.nextInt();
                int second = input.nextInt();
                int tot = second - first;
                time += tot;
            }
            System.out.println(time);
        }
    }
}
