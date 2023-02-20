import java.util.Scanner;

public class BabyBites {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String [] num = new String [n];
        int con = 0;
        input.nextLine();
        String next = input.nextLine();
        for (int i = 1; i <=n; i++) {
            num [i-1] = String.valueOf(i);
        }
        String [] words = next.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(num[i]) || words[i].equals("mumble")) con++;
        }
        if (con == words.length) System.out.println("makes sense");
        else System.out.println("something is fishy");
    }
}
