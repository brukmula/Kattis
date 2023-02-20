import java.util.Scanner;

public class QualityOfLife {

    public static void main(String [] args){

        int n;

        double qol = 0.0;

        double q;
        double y;

        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        for (int i = 0; i <n ; i++) {
            q = input.nextDouble();
            y = input.nextDouble();
            qol = qol + (q*y);
        }

        System.out.println(qol);
    }
}
