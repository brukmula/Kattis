import java.util.*;

public class BaconEggs {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        while (true) {
            int n = input.nextInt();
            input.nextLine();
            if (n == 0) break;
            ArrayList <String> list = new ArrayList<>();
            String names= "";
            for (int i = 0; i <n; i++) {
                String line = input.nextLine();
                String [] array = line.split(" ");
                String name = array[0];
                for (int j = 1; j < array.length; j++) {
                    list.add(array[j]);
                }
                System.out.println();
            }
        }
    }
}
