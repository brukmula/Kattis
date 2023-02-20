import java.util.Scanner;

public class DasBlinkenlights {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int f = input.nextInt(), s = input.nextInt(), dur = input.nextInt();
        int n=0, m=0;
        String word = "no";

        for (int i = 1; i <=dur; i++) {
            if (i%f == 0) n+=f;
            if (i%s == 0) m+=s;
            if (m == n && n !=0) word = "yes";
        }
        System.out.println(word);

    }
}
