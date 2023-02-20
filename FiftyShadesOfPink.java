import java.util.Scanner;

public class FiftyShadesOfPink {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for (int i = 0; i <n ; i++) {
            String word = input.next();
            word = word.toLowerCase();
            if (word.contains("rose")){
                count++;
            }
            else if (word.contains("pink")){
                count++;
            }
        }
        if (count > 0){
            System.out.println(count);
        }
        else {
            System.out.println("I must watch Star Wars with my daughter");
        }
    }
}
