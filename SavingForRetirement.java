import java.util.Scanner;

public class SavingForRetirement {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int b = input.nextInt();
        int br = input.nextInt();
        int bs = input.nextInt();
        int a = input.nextInt();
        int as = input.nextInt();

        int bobTotal = (br-b) * bs;
        int aliceTotal = 0;
        int count = 1;

        while (true){
            aliceTotal+= as;
            if (aliceTotal > bobTotal) break;
            else count++;
        }

        System.out.println(a+ count);

    }
}
