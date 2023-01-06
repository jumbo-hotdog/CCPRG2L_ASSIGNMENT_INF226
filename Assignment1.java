import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student email: ");
        String studentEmail = scan.nextLine();

        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("Valid student email.");
        } else {
            System.out.println("Invalid student email.");
        }

        System.out.print("Enter phone number: ");
        String phoneNum = scan.nextLine();

        match = Pattern.matches("\\+639\\d{9}", phoneNum);

        if (match) {
            System.out.println("Valid phone number.");
        } else {
            System.out.println("Invalid phone number.");
        }

        System.out.print("Enter birth date [YYYY-MM-DD]: ");
        String birthDate = scan.nextLine();

        match = Pattern.compile("\\d{4}-\\d{2}-\\d{2}").matcher(birthDate).matches();

        if (match) {
            System.out.println("Valid birth date.");
        } else {
            System.out.println("Invalid birth date.");
        }
    }
}


