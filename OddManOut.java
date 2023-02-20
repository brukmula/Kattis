import java.util.*;

public class OddManOut {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i <n; i++) {
            int m = input.nextInt();
            int oddMan = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j <m; j++) {
                list.add(input.nextInt());
            }
            Set <Integer> setReturn = new HashSet<>();
            Set <Integer> set1 = new HashSet<>();

            for (Integer num:list) {
                if (!set1.add(num)){
                    setReturn.add(num);
                }
            }

            list.removeAll(setReturn);
            oddMan = list.get(0);
            System.out.println("Case #" + (i+1) + ": " + oddMan);
        }
    }
}
