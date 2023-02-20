import java.util.Scanner;

public class Basketball1On1 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        String nextLine = input.nextLine();
        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i <nextLine.length()-1; i++) {
            int value = Character.getNumericValue(nextLine.charAt(i + 1));
            if (nextLine.charAt(i) == 'A'){
                aCount += value;
            }
            else if
            (nextLine.charAt(i) == 'B') bCount+= value;
        }
        if (aCount > bCount) System.out.println("A");
        else System.out.println("B");
    }
}
