import java.util.Scanner;

public class Filip {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int fr =0, sr =0;
        int first = input.nextInt();
        int second = input.nextInt();
        while (first != 0){
            int d = first%10;
            fr = fr* 10 +d;
            first = first/10;
        }
        while (second != 0){
            int d = second%10;
            sr = sr* 10 +d;
            second = second/10;
        }
        System.out.println(Math.max(fr,sr));
    }
}
