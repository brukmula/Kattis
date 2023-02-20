import java.util.Scanner;

public class BatterUp {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        double c = 0;
        int count =0;
        int l = input.nextInt();
        for (int i = 1; i <=l; i++) {
            double num = input.nextDouble();
            if (num >= 0) {
                c += num;
                count++;
            }
        }
        System.out.println(c/count);
    }
}
