import java.util.Scanner;

public class Exercise2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive("driver");
        scan.close();
    }

    static void drive(String driver) {

        System.out.println("Driving!");
        driving(driver);

        String feedback = getFeedBack(driver);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            practiceMore(driver);

            // Recursive call
            drive(driver);
        } else if (feedback.equals("yes")) {
            finish(driver);
        }
    }

    static void driving(String driver) {
        System.out.println("Driver's test ongoing..");
    }

    static String getFeedBack(String driver) {
        System.out.println("Is the " + driver + "'s driving test successful? (Enter \"yes\" or \"no\")");
        
        String feedback = scan.next();

        return feedback;
    }

    static void practiceMore(String driver) {
        System.out.println("What skill do you want to improve?");
        String skill = scan.next();
        System.out.println(skill + " skill added.");
    }

    static void finish(String driver) {
        System.out.println("Driving test of " + driver + " complete.");
    }

}