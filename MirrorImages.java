import java.util.Scanner;

public class MirrorImages {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i <n; i++) {
            int row = input.nextInt();
            int col= input.nextInt();
            char [][] arr = new char [row][col];
            for (int j = 0; j <row; j++) {
                String line = input.next();
                for (int k = 0; k <col; k++) {
                    arr[j][k] = line.charAt(k);
                }
            }
            System.out.println("Test " + (i+1));
            for (int j = row-1; j >=0; j--) {
                for (int k = col-1; k >=0; k--) {
                    System.out.print(arr[j][k]);
                }
                System.out.println();
            }
        }
    }
}
