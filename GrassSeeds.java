import java.util.Scanner;

public class GrassSeeds {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        double total = 0;
        double cost = input.nextDouble();
        int lawnNumber = input.nextInt();
        for (int i = 0; i <lawnNumber ; i++) {
            double width = input.nextDouble();
            double length = input.nextDouble();
            total += width*length*cost;
        }
        System.out.println(total);
    }
}
