package String;

import java.util.Scanner;

public class Replacer {
    public String replaceString(String str, String oldSub, String newSub) {
        if (str == null || oldSub == null || newSub == null || oldSub.isEmpty()) {
            return str;
        }
        StringBuilder replaced = new StringBuilder();
        int startIndex = 0;
        int findIndex;

        while ((findIndex = str.indexOf(oldSub, startIndex)) != -1){
            replaced.append(str.substring(startIndex, findIndex));
            replaced.append(newSub);

            startIndex = findIndex + oldSub.length();
        }
        if(startIndex < str.length()) {
            replaced.append(str.substring(startIndex));
        }

        return replaced.toString();
    }

    public static void main(String[] args) {

try (Scanner sc = new Scanner(System.in)) { // Using try-with-resources

Replacer obj = new Replacer();

System.out.print("Enter the main string: ");

String str = sc.nextLine();

System.out.print("Enter the substring to replace: ");

String oldSub = sc.nextLine();

System.out.print("Enter the new substring: ");

String newSub = sc.nextLine();

String result = obj.replaceString(str, oldSub, newSub);

System.out.println("Modified string: " + result);

}

}
}
