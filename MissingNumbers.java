import java.util.Scanner;

public class MissingNumbers {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        int count = 0;
        for (int i = 0; i <n; i++) {
            arr[i]  = input.nextInt();
        }
        for (int i = 1; i <arr[n-1]; i++) {
            if (i == arr[sum]) sum++;
            else {
                System.out.println(i);
                count++;
            }
        }
        if (count == 0) System.out.println("good job");
    }
}
