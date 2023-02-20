import java.util.Scanner;

public class Ptice {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a=0,b=0,g=0;
        String answers = input.next();
        String Adrian = "ABC".repeat(n), Bruno = "BABC".repeat(n), Goran= "CCAABB".repeat(n);
        for (int i = 0; i <n; i++) {
            if (answers.charAt(i) == Adrian.charAt(i)){
                a++;
            }if (answers.charAt(i) == Bruno.charAt(i)){
                b++;
            }
            if (answers.charAt(i) == Goran.charAt(i)){
                g++;
            }
        }
        System.out.println(Math.max(Math.max(a,b),g));
        if (a ==Math.max(Math.max(a,b),g))
            System.out.println("Adrian");
        if (b == Math.max(Math.max(a,b),g)) System.out.println("Bruno");
        if (g == Math.max(Math.max(a,b),g)) System.out.println("Goran");
    }
}
