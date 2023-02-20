import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Sum {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i <n; i++) {
            int num = input.nextInt();
            int toAdd = input.nextInt();
            int s1 = 0;
            int s2 = 0;
            int s3 = 0;
            int count = 1;
            for (int j = 1; j <=toAdd; j++) {
                s1 += j;
            }

            for (int j = 0; j <toAdd *2 ; j++) {
                if (count % 2 != 0) {
                    s2 += count;
                }
                if (count %2 == 0){
                    s3+= count;
                }
                count++;
            }
            System.out.println(num + " " + s1 + " " + s2 + " " + s3);
        }
    }
}
