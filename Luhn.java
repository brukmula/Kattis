import java.util.Scanner;

public class Luhn {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i <n ; i++) {
            String line = input.next();
            int [] array = new int [line.length()];
            int [] second;
            int c = 0;
            for (int j = 0; j <line.length(); j++) {
                array[j] = Character.getNumericValue(line.charAt(j));
            }
            second = array.clone();
            for (int j = line.length()-2; j >=0 ; j-=2) {
                if ((array[j]*2) >9){
                    String first = Integer.toString(array[j]*2);
                    int num1 = Character.getNumericValue(first.charAt(0));
                    int num2 = Character.getNumericValue(first.charAt(1));
                    second[j] = num1+num2;
                }
                else
                    second[j] = array[j]*2;

            }
            for (int j = 0; j <second.length ; j++) {
                c+= second[j];
            }
            if (c%10 == 0)
                System.out.println("PASS");
            else System.out.println("FAIL");
        }
    }
}
