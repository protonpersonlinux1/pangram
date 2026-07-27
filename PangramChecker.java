package String;
import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        boolean isPangram = true;

        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (sentence.indexOf(letter) == -1) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("the sentence is a pangram.");
        } else {
            System.out.println("the sentence is not a pangram.");
        }

        scanner.close();
    }
}
