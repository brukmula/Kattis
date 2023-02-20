import java.util.*;

public class Modulo {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <10; i++) {
            int n = input.nextInt();
            int mod = n % 42;
            if (!list.contains(mod)) list.add(mod);
        }
        System.out.println(list.size());
    }
}
