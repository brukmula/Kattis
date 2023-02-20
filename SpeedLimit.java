import java.util.Scanner;

public class SpeedLimit {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        while (true){
            int n = input.nextInt();
            if (n == -1) break;
            int previousTime = 0, totalMiles = 0;
            int [] mph  = new int [n];
            int [] time = new int [n];
            for (int i = 0; i <n; i++) {
                int speed = input.nextInt();
                int currentTime = input.nextInt();
                time[i] = currentTime- previousTime;
                mph[i] = speed;
                previousTime = currentTime;
            }
            for (int i = 0; i <n; i++) {
                totalMiles += (time[i]*mph[i]);
            }
            System.out.println(totalMiles + " miles");
        }
    }
}
