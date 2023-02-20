import java.util.*;

public class BookingARoom {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int n = input.nextInt();
        ArrayList <Integer> list = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
            list.add(i);
        }

        for (int i = 0; i <n; i++) {
            int number = input.nextInt();
            list.remove(Integer.valueOf(number));
        }

        if (list.isEmpty()) System.out.println("too late");
        else {
            Random rand = new Random();
            int randomElement = list.get(rand.nextInt(list.size()));
            System.out.println(randomElement);
        }
    }
}
