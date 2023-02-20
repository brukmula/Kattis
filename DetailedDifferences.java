import java.util.Scanner;

public class DetailedDifferences {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i <n ; i++) {
            String first = input.next();
            String second = input.next();

            System.out.println(first);
            System.out.println(second);
            for (int j = 0; j <first.length() ; j++) {
                if (first.charAt(j) == second.charAt(j))
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
