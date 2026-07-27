package String;
import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        Substring obj = new Substring();
        System.out.println("Enter the string: ");
        String s = scn.nextLine();

        System.out.println("Enter the substring: ");
        String ss = scn.nextLine();

        if(obj.check(s, ss)){
            System.out.println(ss + " is a substring of " + s);
        } else{
            System.out.println(ss + " is not a substring of " + s);
        }
        

    }

    public boolean check(String s, String ss){
        int css = s.indexOf(ss);
        return css >=0;
    }
}
