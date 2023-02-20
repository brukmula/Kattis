import java.util.Scanner;
public class HarshadNumbers {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        while (n % harsh(n) != 0)
            n++;
        System.out.println(n);

    }
    public static int harsh(int og){

        int total  = 0;
        while (og > 0){
            total += (og%10);
            og = og/10;
        }
        return total;
    }
}
