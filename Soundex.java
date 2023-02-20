import java.util.*;

public class Soundex {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        String word = "";
        String previous_num = "";
        String num_to_add = "";
        boolean exists = false;
        int prev_index =-1;

        while(input.hasNextLine()){
            String name = input.nextLine();
            for(int i =0; i < name.length(); i++){
                char letter = name.charAt(i);
                    switch(letter){
                        case 'B':
                        case 'F':
                        case 'P':
                        case 'V':
                            num_to_add = "1";
                            exists = true;
                            break;
                        case 'C':
                        case 'G':
                        case 'J':
                        case 'K':
                        case 'Q':
                        case 'S':
                        case 'X':
                        case 'Z':
                            num_to_add = "2";
                            exists = true;
                            break;
                        case 'D':
                        case 'T':
                            num_to_add = "3";
                            exists = true;
                            break;
                        case 'L':
                            num_to_add = "4";
                            exists = true;
                            break;
                        case 'M':
                        case 'N':
                            num_to_add = "5";
                            exists = true;
                            break;
                        case 'R':
                            num_to_add = "6";
                            exists = true;
                            break;
                    }

                if (!num_to_add.equals(previous_num)) {
                        word = word.concat(num_to_add);
                }
                    if (exists )
                        previous_num = num_to_add;
                    prev_index = i;
                    exists = false;
            }

            System.out.println(word);
            word = "";
            previous_num = "";
            num_to_add = "";
            prev_index = -1;
        }
    }
}