import java.util.Scanner;

public class ElectricalOutlets {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <=num ; i++) {
            int volt =0;
            int testVol = input.nextInt();
            for (int j = 1; j <=testVol ; j++) {
                int out = input.nextInt();
                volt=  volt + out;
            }
            System.out.println(volt- (testVol-1));
        }
    }
}
