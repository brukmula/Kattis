import java.util.Scanner;

public class Pet {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int [] arr = new int [5];
        int max = 0;
        int flag = 0;
        for (int i = 1; i <=5 ; i++) {
            int sum = 0;
            for (int j = 1; j <=4 ; j++) {
                int n = input.nextInt();
                sum += n;
            }
            arr [i-1] = sum;
        }
        for (int i = 0; i <= 4 ; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                flag = i;
            }
        }
        System.out.println(flag+1 + " " + max);
    }
}
