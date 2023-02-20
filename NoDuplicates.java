import java.util.Scanner;

public class NoDuplicates {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String [] arr = sentence.split(" ");
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j].equals(arr[i])){
                    count++;
                }
            }
        }
        if (count >0){
            System.out.println("no");
        }
        else System.out.println("yes");
    }
}
