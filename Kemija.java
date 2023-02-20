import java.util.Scanner;

public class Kemija {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
            String [] word = input.nextLine().split("");
            for (int i = 0; i <word.length; i++) {
                String l = word[i];
                System.out.print(l);
                if (l.equals("a") || l.equals("e")|| l.equals("i")|| l.equals("o")||l.equals("u")){
                    i+=2;
                }
            }

    }
}
