import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LineThemUp {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> reverse = new ArrayList<>();

        for (int i = 0; i <n; i++) {
            list.add(input.next());
        }

        ArrayList <String> sorted =  new ArrayList<>(list);
        Collections.sort(sorted);

        for (int i = list.size() -1; i >=0; i--) {
            reverse.add(sorted.get(i));
        }

        if (list.equals(sorted))
            System.out.println("INCREASING");
        else if (list.equals(reverse))
            System.out.println("DECREASING");
        else System.out.println("NEITHER");




    }
}
