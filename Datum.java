import java.time.LocalDate;
import java.util.*;

public class Datum {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int month = input.nextInt();
        LocalDate date = LocalDate.now().minusYears(11);
        String str = date.withMonth(month).withDayOfMonth(day).getDayOfWeek().toString();
        String letter = String.valueOf(str.toLowerCase().charAt(0));
        str = str.replaceFirst(letter.toUpperCase(), "");
        System.out.println(letter.toUpperCase() + str.toLowerCase());

    }
}
