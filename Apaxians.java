import java.util.Scanner;

public class Apaxians {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int index = 0;

        String word = input.nextLine();
        char [] array = new char[word.length()];

        for (int i = 0; i <word.length(); i++) {
            array[i] = word.charAt(i);
        }
        for (int i = 0; i <word.length(); i++) {
            for (int j = 0; j <i; j++) {
                if (array[i] == array[j]) break;

                if (j == i) array[index++] = array[i];
            }
        }

        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]);
        }

    }
}
