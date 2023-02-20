import java.util.Scanner;

public class JobExpenses {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int expenses =0;
        for (int i = 0; i <n ; i++) {
            int num = input.nextInt();
            if (num < 0)
                expenses += (num*-1);
        }
        System.out.println(expenses);
    }
}
