import java.util.Scanner;

public class Launch {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int day = -1;
        int min = -1;
        int n = input.nextInt();
        for (int i = 0; i <n ; i++) {
            int space = input.nextInt();
            if (day == -1 || space < day){
                day = space;
                min = i;
            }
        }
        System.out.println(min);
    }
}
