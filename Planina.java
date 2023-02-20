import java.util.Scanner;

public class Planina {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int iterations = input.nextInt();
        double i = Math.sqrt(Math.pow(4,iterations))+1;
        System.out.println((int)(i*i));
    }
}
