import java.util.Scanner;

class EraseSecurely {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String first = input.next();
        String second = input.next();
        String output = " ";

        if (n%2 == 0){
            if (first.equals(second)) System.out.println("Deletion succeeded");
            else System.out.println("Deletion failed");
        }else {
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) == second.charAt(i)) {
                    output = "Deletion failed";
                    break;
                } else output = "Deletion succeeded";
            }
            System.out.println(output);
        }
    }
}
