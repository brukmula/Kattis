import java.util.Scanner;

public class RatingProblems {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        double pos = input.nextInt();
        double exist = input.nextInt();
        int sum = 0;
        for (int i = 0; i <exist; i++) {
            sum+= input.nextInt();
        }
        double maxResult = (((pos - exist)*3)+ sum)/pos;
        double minResult = (sum -((pos - exist)*3))/pos;
        System.out.println(minResult + " " + maxResult);
    }
}
