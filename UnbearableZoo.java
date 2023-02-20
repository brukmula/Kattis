import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UnbearableZoo {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int i= input.nextInt();
        input.nextLine();
        while(i != 0){
            ArrayList <String> list = new ArrayList<>();
            int count = 0;
            for (int j = 0; j <i; j++) {
                String word = input.nextLine();
                String last = word.substring(word.lastIndexOf(" ") +1).toLowerCase();
                list.add(last);
            }
            Collections.sort(list);
            for (int j = 0; j < list.size(); j++) {
                String search = list.get(j);
                if (list.contains(search))count++;

            }
            System.out.println(list);
            i = input.nextInt();

        }
    }
}
