import java.util.Scanner;

public class Apaxian {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        String first = input.next();
        String second = input.next();
        String extended;
        char f = first.charAt(first.length()-1);
        if (f == 'e'){
            extended = first + "x" + second;
        }
        else if (f == 'a' || f == 'i' || f == 'o' || f == 'u'){
            extended = first.substring(0,first.length()-1) + "ex" + second;
        }else if (first.substring(first.length()-2,first.length()).equals("ex")){
            extended = first+second;
        }
        else {
            extended  = first +"ex" + second;
        }
        System.out.println(extended);

    }
}
