import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name");
            String userInput = keyboard.nextLine();
            String firstName = userInput.substring(0, userInput.indexOf(" "));
            String lastName = userInput.substring(userInput.indexOf(" "));
            firstNames.add(firstName);
            lastNames.add(lastName);

        }
        for (int i = 0; i < firstNames.size(); i++) {
            for(int j = 0; j < lastNames.size(); j++) {
                System.out.print(firstNames.get(i) + " ");
                System.out.println(lastNames.get(j));
            }
        }
    }

}
