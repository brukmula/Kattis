import java.util.HashSet;
import java.util.Scanner;

public class IveBeenEverywhere {

    public static void main(String [] args) {



        Scanner input = new Scanner(System.in);

        int numTrips;
        int numDestinations;

        //Input the number of test cases
        numTrips = input.nextInt();

        //nested for loop to go enter cities
        for (int i = 0; i <numTrips ; i++) {
            HashSet<String> setter  = new HashSet<>();
            numDestinations = input.nextInt();
            input.nextLine();
            for (int j = 0; j < numDestinations; j++) {
                setter.add(input.nextLine());
            }
            System.out.println(setter.size());
        }
    }
}
