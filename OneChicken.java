import java.util.Scanner;

public class OneChicken {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int f = input.nextInt();
        int s = input.nextInt();

        if (s-f> 0){
            if (s-f == 1) System.out.println("Dr. Chaz will have "+ (s-f) +" piece of chicken left over!");
            else System.out.println("Dr. Chaz will have "+ (s-f) +" pieces of chicken left over!");
        }else {
            if (((f-s)) == 1) System.out.println("Dr. Chaz needs "+ ((f-s)) +" more piece of chicken!");
            else System.out.println("Dr. Chaz needs " + ((f - s)) + " more pieces of chicken!");
        }
    }
}
