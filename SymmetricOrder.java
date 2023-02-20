import java.util.Scanner;

public class SymmetricOrder {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = 1, count = 0;
        while (true){
            n = input.nextInt();
            if (n == 0) break;
            int j = 0;
            int f = n;
            count++;
            String [] unordered = new String[n];
            for (int i = 0; i <n; i++) {
                unordered[i] =input.next();
            }
            String [] ordered = new String[n];
            ordered[0] = unordered[0];
            for (int i = 0; i <n; i++) {
                if (j >= n || i+1 >=n) break;
                ordered[i] = unordered[j];
                j+=2;
            }
            for (int i = 1; i <n ; i+=2) {
                ordered[f-1] = unordered[i];
                f--;
            }
            System.out.println("SET " + count);
            for (int i = 0; i <n; i++) {
                System.out.println(ordered[i]);
            }
        }
    }
}
