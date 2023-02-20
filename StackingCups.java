//You can use a stack to make this easier
import java.util.Arrays;
import java.util.Scanner;

public class StackingCups {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String [] array = new String[n];
        int [] arr = new int[n];
        int [] sorted;
        String [] index = new String [n];
        for (int i = 0; i <n; i++) {
            if (input.hasNextInt()){
                int num = input.nextInt();
                arr[i] = num/2;
                array[i] = input.nextLine().trim();
            }else if(input.hasNextLine()){
                String name = input.next();
                arr[i] = input.nextInt();
                array[i] = name;
            }
        }
        sorted = arr.clone();
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (sorted[i] == arr[j]){
                    index[j] = array[i];
                }
            }

        }
        for (int i = 0; i <index.length ; i++) {
            System.out.println(index[i]);
        }
    }
}
