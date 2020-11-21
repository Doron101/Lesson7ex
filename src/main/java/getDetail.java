import java.util.ArrayList;
import java.util.Scanner;

public class getDetail {

    public static void getDetails() throws Exception {
        String input;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls enter a name");
        input = scanner.nextLine();
        input = input.concat("\n");
        logSingleton firstWord = logSingleton.getlogFile();
        firstWord.writetoFile(input);

        System.out.println("Pls enter age");
        input = scanner.nextLine();
        input = input.concat("\n");
        logSingleton secondWord = logSingleton.getlogFile();
        secondWord.writetoFile(input);

        System.out.println("Pls enter address");
        input = scanner.nextLine();
        input = input.concat("\n");
        logSingleton thirdWord = logSingleton.getlogFile();
        thirdWord.writetoFile(input);

        System.out.println("Pls enter a phone number");
        input = null;
        input = scanner.nextLine();
        input = input.concat("\n");
        logSingleton fourthWord = logSingleton.getlogFile();
        fourthWord.writetoFile(input);

    }
}
