import java.util.Scanner;

public class Trik {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        char [] sequence = input.next().toCharArray();
        int current = 1;
        for (int i = 0; i < sequence.length; i++) {
            char cup = sequence[i];
            if (cup == 'A'){
                if(current ==1) current = 2;
                else if(current == 2) current = 1;
                else current = 3;
            } else if (cup == 'B'){
                if (current ==1) current =1;
                else if(current == 2) current =3;
                else current =2;
            }else{
                if (current ==1) current =3;
                else if (current == 2) current = 2;
                else current = 1;
            }
        }
        System.out.println(current);
    }
}
