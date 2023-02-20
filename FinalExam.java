import java.util.Scanner;

public class FinalExam {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int grade = 0;
        String [] arr = new String[n];
        for (int i = 0; i <n ; i++) {
            String letter = input.next();
            arr[i] = letter;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1].equals(arr[i])){
                grade++;
            }
        }
        System.out.println(grade);
    }
}
