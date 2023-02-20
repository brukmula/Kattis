import java.util.Scanner;

public class EncodedMessage {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        char [] [] message;
        for (int x = 0; x<n ; x++) {
            String word = input.next();
            int l = 0;
            int m = (int) Math.sqrt(word.length());
            message = new char[m][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (l == word.length()){
                        break;
                    }
                    message [i][j] = word.charAt(l);
                    l++;
                }
            }
            for (int i = m-1; i >=0 ; i--) {
                for (int j = 0; j <m ; j++) {
                    System.out.print(message[j][i]);
                }
            }
            System.out.println();
        }

    }
}
