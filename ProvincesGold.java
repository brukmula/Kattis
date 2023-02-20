import java.util.Scanner;

public class ProvincesGold {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int count = 0;
        int g = input.nextInt()*3, s = input.nextInt()*2, c = input.nextInt();

        if (g+s+c < 5 && g+s+c >=2){
            System.out.print("Estate");
            count+=1;
        }
        else if (g+s+c >= 5 && g+s+c < 8) {
            System.out.print("Duchy");
            count+=1;
        }
        else if (g+s+c >= 8){
            System.out.print("Province");
            count+=1;
        }

        if (count ==1)
            System.out.print(" or ");

        if (g+s+c >= 6)
            System.out.print("Gold");
        else if (g+s+c < 6 && g+s+c >= 3 )
            System.out.print("Silver");
        else
            System.out.print("Copper");

    }
}
