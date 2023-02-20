import java.util.Scanner;

public class Crypto {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        String word = input.next();
        int count = word.length();
        int first =0;
        int after = 3;
        for (int i = 0; i <word.length()/3 ; i++) {
            String newWord = word.substring(first,after);
            first = after;
            after += 3;
            if (newWord.charAt(0) == 'P'){
                count--;
            } if (newWord.charAt(1) == 'E'){
                count --;
            }if (newWord.charAt(2) == 'R')
                count--;
        }
        System.out.println(count);
    }
}
