import java.util.Scanner;

public class LaptopSticker {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int wc = input.nextInt(), hc = input.nextInt(), ws = input.nextInt(), hs = input.nextInt();
        int ca = (wc-ws);
        int sa = (hc-hs);
        if (ca >= 2 && sa >= 2) System.out.println(1);
        else System.out.println(0);
    }
}
