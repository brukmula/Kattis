import java.util.Scanner;

public class LastFactorial {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        String num;
        for (int i = 0; i <n ; i++) {
            int factorial = 1;
            int number = input.nextInt();
            num = "";
            for (int j = 1; j <=number; j++) {
                factorial *=j;
                num = Integer.toString(factorial);
            }
            System.out.println(num.charAt(num.length()-1));
        }
    }
}
