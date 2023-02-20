import java.util.Scanner;

public class Pot {

    public static void main(String [] args){

        int N;
        int p;
        String p2;
        int last;
        char l;
        int sum = 0;
        int x = 0;

        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 1; i <=N; i++) {
            p = input.nextInt();
            p2 = Integer.toString(p);
            l = p2.charAt(p2.length()-1);
            last = (l) - '0';
            p2 = p2.substring(0,p2.length()-1);
            x = Integer.parseInt(p2);
            //sum = (int) (sum + (Math.pow(p,i)));
            sum = sum + (int) (Math.pow(x,last));
        }

        System.out.println(sum);
    }
}
