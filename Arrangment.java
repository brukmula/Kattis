import java.util.Scanner;

public class Arrangment {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();

        int rem = m%n;
        int num;
        int b = m/n;

        for (int i = 0; i <n; i++) {
            if (rem >0) num =1;
            else num = 0;
            String out = "";
            for (int j = 0; j <b + num; j++) {
                if (m!= 0)
                    out = out.concat("*");
                m--;
            }
            rem--;
            System.out.println(out);
        }
    }
}
