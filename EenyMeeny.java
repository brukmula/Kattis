import java.util.ArrayList;
import java.util.Scanner;

public class EenyMeeny {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String firstLine = input.nextLine();
        int n = input.nextInt();
        String [] array = firstLine.split(" ");
        int pick = array.length;
        ArrayList <String> firstTeam = new ArrayList<>();
        ArrayList <String> secondTeam = new ArrayList<>();

        ArrayList <String> allNames = new ArrayList<>();
        for (int i = 0; i <pick; i++) {
            allNames.add(array[i]);
        }

        boolean val = false;
        while(true){

            if (allNames.isEmpty()) break;

            for (int i = 0; i <pick; i++) {

                if (!val){
                    firstTeam.add(allNames.get(i));
                    allNames.remove(allNames.get(i));
                    val = true;
                } else if (val){
                    secondTeam.add(allNames.get(i));
                }
            }
        }

        System.out.println(firstTeam.size());
        for (int i = 0; i < firstTeam.size(); i++) {
            System.out.println(firstTeam.get(i));
        }
        System.out.println(secondTeam.size());
        for (int i = 0; i < secondTeam.size(); i++) {
            System.out.println(firstTeam.get(i));
        }


    }
}
