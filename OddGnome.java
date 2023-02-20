import java.util.Scanner;

public class OddGnome {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr;
        for (int i = 0; i <n; i++) {
            int f = input.nextInt();
            arr = new int [f];
            for (int j = 0; j <f; j++) {
                arr[j] = input.nextInt();
            }
            for (int j = 0; j <f-1; j++) {
                if (arr[j+1] != arr[j]+1) {
                    System.out.println(j + 2);
                    break;
                }
            }
        }
    }
}
