import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int r = input.nextInt(), c = input.nextInt();
        List<List<String>> generalList = new ArrayList<>();
        for (int i = 0; i <r; i++) {
            ArrayList<String> myGroup = new ArrayList<>();
            for (int j = 0; j <c; j++) {
                myGroup.add(input.next());
            }
            generalList.add(myGroup);
        }
        List<List<String>> clone = generalList;
        List<String> list  = clone.get(0);
        for (int i = 1; i <clone.size(); i++) {
            list.retainAll(clone.get(i));
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
