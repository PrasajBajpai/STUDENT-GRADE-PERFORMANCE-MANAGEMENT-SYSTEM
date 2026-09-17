import java.util.Scanner;

public class InputValidator {

    public static double getValidMarks(
            Scanner scanner,
            String subject) {

        double marks;

        while (true) {

            System.out.print("Enter " + subject + " marks: ");

            marks = scanner.nextDouble();

            if (marks >= 0 && marks <= 100) {

                return marks;
            }

            System.out.println(
                    "Invalid marks! Enter marks between 0 and 100."
            );
        }
    }
}