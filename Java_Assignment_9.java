//String and Type Information
//
//        Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.
//

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_Assignment_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^[A-Z][A-Za-z0-9_!@#\\$%\\^\\&*\\)\\(+=.\\s+]*[.]$";
        Pattern pattern = Pattern.compile(regex);
        String input = sc.nextLine();
        Matcher matcher = pattern.matcher(input);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
