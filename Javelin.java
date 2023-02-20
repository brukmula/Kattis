import java.util.Scanner;

public class Javelin {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;

        for (int i = 0; i <n; i++) {
            int num = input.nextInt();
            sum += (num);
        }
        sum = sum - (n-1);
        System.out.println(sum);
    }
}
