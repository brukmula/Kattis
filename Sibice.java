import java.util.Scanner;

public class Sibice {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int w = input.nextInt();
        int h = input.nextInt();
        double box = w*w + h*h;

        for (int i = 0; i <n ; i++) {
            int num = input.nextInt();
            if ((num*num) <= box){
                System.out.println("DA");
            }
            else System.out.println("NE");
        }
    }
}
