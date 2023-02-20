import java.util.Scanner;

public class ToLower {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int p = input.nextInt(), t = input.nextInt();
        input.nextLine();
        int count = 0, score =0 ;
        String [] array = new String[p*t];
        for (int i = 0; i <p*t; i++) {
            String line = input.nextLine();
            array[i] = line;
            String fL= array[i].substring(0,1).toLowerCase();
            int length = array[i].length();
            array[i] =  fL+array[i].substring(1,length);
        }
        while(count <p*t) {
            int right = 0;
            for (int i = 0; i < t; i++) {
                if (array[count].toLowerCase().equals(array[count])) right++;
                count++;
            }
            if (right == t) score++;
        }
        System.out.println(score);
    }
}
