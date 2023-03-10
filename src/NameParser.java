import java.util.Locale;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("name plz");
        String userName = keyboard.nextLine();
        String firstName = userName.substring(0, userName.indexOf(" "));
        System.out.println(firstName.toUpperCase());
        String lastName = userName.substring((userName.indexOf(" ") + 1), userName.length());
        System.out.println(lastName.toUpperCase());

    }
}
