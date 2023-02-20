import java.util.Scanner;

public class Oddities {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        for (int i = 0; i <n; i++) {
            int num = input.nextInt();
            if (num%2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
    }
}
