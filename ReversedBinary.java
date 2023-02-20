import java.util.Scanner;

public class ReversedBinary {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        int i = input.nextInt();
        String num = Integer.toBinaryString(i);
        builder.append(num);
        int dec = Integer.parseInt(String.valueOf(builder.reverse()),2);
        System.out.println(dec);
    }
}
