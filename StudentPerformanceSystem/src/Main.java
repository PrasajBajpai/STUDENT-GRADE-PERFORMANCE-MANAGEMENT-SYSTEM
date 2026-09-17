import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {

            System.out.println("\n==============================================");
            System.out.println("     STUDENT GRADE & PERFORMANCE SYSTEM");
            System.out.println("==============================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Generate Student Result");
            System.out.println("5. Performance Report");
            System.out.println("6. Exit");
            System.out.println("==============================================");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    manager.addStudent(scanner);
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    manager.searchStudent(scanner);
                    break;

                case 4:
                    manager.generateResult(scanner);
                    break;

                case 5:
                    ReportGenerator.generateReport(manager.getStudents());
                    break;

                case 6:
                    System.out.println("\nThank you for using the system!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }
}