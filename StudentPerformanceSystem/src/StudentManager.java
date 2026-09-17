import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {

        students = new ArrayList<>();
    }

    public void addStudent(Scanner scanner) {

        System.out.println("\n========== ADD STUDENT ==========");

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (findStudent(id) != null) {

            System.out.println("Student ID already exists.");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.println("\nEnter marks out of 100:");

        double mathematics = InputValidator.getValidMarks(scanner, "Mathematics");
        double java = InputValidator.getValidMarks(scanner, "Java");
        double dbms = InputValidator.getValidMarks(scanner, "DBMS");
        double dsa = InputValidator.getValidMarks(scanner, "DSA");

        Student student = new Student(id, name, course);

        Marks marks = new Marks(
                mathematics,
                java,
                dbms,
                dsa
        );

        student.setMarks(marks);

        students.add(student);

        System.out.println("\nStudent added successfully!");
    }

    public void viewStudents() {

        System.out.println("\n========== ALL STUDENTS ==========");

        if (students.isEmpty()) {

            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {

            System.out.println("----------------------------------------------");

            student.displayStudent();

            if (student.getMarks() != null) {

                System.out.printf(
                        "Percentage : %.2f%%\n",
                        student.getMarks().getPercentage()
                );

                System.out.println(
                        "Grade      : " +
                                GradeCalculator.calculateGrade(
                                        student.getMarks().getPercentage()
                                )
                );
            }
        }

        System.out.println("----------------------------------------------");
    }

    public void searchStudent(Scanner scanner) {

        System.out.println("\n========== SEARCH STUDENT ==========");

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        Student student = findStudent(id);

        if (student == null) {

            System.out.println("Student not found.");
            return;
        }

        System.out.println("\nStudent Found!");
        System.out.println("----------------------------------------------");

        student.displayStudent();

        if (student.getMarks() != null) {

            student.getMarks().displayMarks();
        }
    }

    public void generateResult(Scanner scanner) {

        System.out.println("\n========== STUDENT RESULT ==========");

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        Student student = findStudent(id);

        if (student == null) {

            System.out.println("Student not found.");
            return;
        }

        if (student.getMarks() == null) {

            System.out.println("Marks have not been entered for this student.");
            return;
        }

        Marks marks = student.getMarks();

        double percentage = marks.getPercentage();

        System.out.println("\n==============================================");
        System.out.println("               STUDENT RESULT");
        System.out.println("==============================================");

        student.displayStudent();

        System.out.println("----------------------------------------------");

        marks.displayMarks();

        System.out.println("----------------------------------------------");

        System.out.println(
                "Grade       : " +
                        GradeCalculator.calculateGrade(percentage)
        );

        System.out.println(
                "Result      : " +
                        GradeCalculator.calculateResult(percentage)
        );

        System.out.println("==============================================");
    }

    public Student findStudent(int id) {

        for (Student student : students) {

            if (student.getStudentId() == id) {

                return student;
            }
        }

        return null;
    }

    public ArrayList<Student> getStudents() {

        return students;
    }
}