import java.util.Arrays;
import java.util.Scanner;

public class ABC {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int [] n= new int [3];
        int [] num = new int[3];
        for (int i = 0; i <3; i++) {
            num[i] = input.nextInt();
        }
        String word = input.next();
        for (int i = 0; i <3 ; i++) {
            if (word.charAt(i) == 'A') n[i] = 0;
            else if (word.charAt(i) == 'B')n[i] = 1;
            else n[i] =2;
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j <n.length ; j++) {
                if (n[i] == j) System.out.print(num[j] + " ");
            }
        }
    }
}
