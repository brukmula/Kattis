import java.util.Scanner;

public class SevenWonders {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int tCount = 0;
        int gCount= 0;
        int cCount = 0;
        int extra = 0;
        for (int i = 0; i <word.length() ; i++) {
            char letter = word.charAt(i);
            if (letter == 'T'){
                tCount++;
            }else if (letter == 'C'){
                cCount++;
            } else{
                gCount++;
            }
        }
        int g = gCount;
        int c = cCount;
        int t = tCount;
        while (true){
            if(tCount == 0 || cCount == 0 || gCount == 0) {
                break;
            }
            extra+=7;
            tCount--;
            cCount--;
            gCount--;
        }
        int total = (int) ((int) Math.pow(t,2)+Math.pow(c,2) + Math.pow(g,2)) + extra;
        System.out.println(total);
    }
}
