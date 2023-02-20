import java.util.Scanner;

public class SortTwoNumbers {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        if (n > m) System.out.println(m +  " " + n);
        else System.out.println(n + " " + m);
    }
}
