package String;
import java.util.*;
public class StringChecker {
    public int countString(String str, String sub){
        int count = 0;
        int index = 0;

        while(index >= 0){
            index = str.indexOf(sub, index);
            if(index >= 0) {
                count++;
                index += sub.length();
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringChecker obj = new StringChecker();
        System.out.println("Enter the main string: ");
        String str = scn.nextLine();
        System.out.println("Enter the substring to count");
        String sub = scn.nextLine();
        int result = obj.countString(str, sub);

        System.out.println("The substring \"" + sub + "\" appears " + result + " times in the main string.");
    }
}
