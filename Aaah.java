import java.util.Scanner;

public class Aaah {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String first = input.next();
        String second = input.next();
        int faCount = 0;
        int saCount =0;
        int fhCount =0;
        int shCount = 0;
        for (int i = 0; i <first.length(); i++) {
            if (first.charAt(i) == 'a') faCount++;
            else if (first.charAt(i) =='h') fhCount++;
        }
        for (int i = 0; i <second.length() ; i++) {
            if (second.charAt(i)== 'a') saCount++;
            else shCount++;
        }
        if ((faCount + fhCount) >= (saCount+shCount)) System.out.println("go");
        else System.out.println("no");
    }
}
