import java.util.Scanner;

public class PHD {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        for (int i = 0; i <n; i++) {
            String line = input.next();
            if (line.equals("P=NP")){
                System.out.println("skipped");
            }
            else{
                int flag = 0;
                for (int j = 0; j <line.length(); j++) {
                    if (line.charAt(j) == '+'){
                        flag = j;
                    }
                }
                int f = Integer.parseInt(line.substring(0,flag) );
                int s = Integer.parseInt(line.substring(flag+1,line.length()));
                System.out.println(f+s);
            }
        }
    }
}
