import java.util.Scanner;

public class Exam {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int ans = input.nextInt(), common = 0, different=0, score = 0;
        String yourAns = input.next();
        String friendsAns = input.next();
        for (int i = 0; i <friendsAns.length(); i++) {
            if (friendsAns.charAt(i) == yourAns.charAt(i)) common++;
            else different++;
        }
        if (common <= ans)System.out.println(common + (friendsAns.length() - ans));
        else System.out.println(ans + (friendsAns.length()- common));
    }
}

