import java.util.Scanner;

public class QuadrantSelection {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int x = input.nextInt(), y = input.nextInt();
        if (x >0) {
            if (y<0)
                System.out.println(4);
            else
                System.out.println(1);
        } else{
            if (y < 0)
                System.out.println(3);
            else
                System.out.println(2);
        }
    }
}
