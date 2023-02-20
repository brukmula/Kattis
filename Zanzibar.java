import java.util.Scanner;

public class Zanzibar {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        boolean set = false;
        for (int i = 1; i <=t ; i++) {
            while (!set){
                int num = input.nextInt();
                
                if (num == 0)
                    set = true;
            }
            set = false;
            System.out.println();
        }
    }
}
