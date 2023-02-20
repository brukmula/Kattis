import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecureDoors {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> in = new ArrayList<>();
        ArrayList<String> out = new ArrayList<>();
        
        int n = input.nextInt();
        for (int i = 0; i <n; i++) {
            System.out.println();
            String status = input.next(), name = input.next();
            if (status.equals("entry")) {
                System.out.print(name + " entered" );
                if (in.contains(name)) System.out.print( " (ANOMALY)");
                in.add(name);
            }
            else if (status.equals("exit")) {
                System.out.print(name + " exited");
                if (!in.contains(name)) System.out.print( " (ANOMALY)");
                else in.removeAll(Collections.singleton(name));
                out.add(name);
            }
        }
    }
}
