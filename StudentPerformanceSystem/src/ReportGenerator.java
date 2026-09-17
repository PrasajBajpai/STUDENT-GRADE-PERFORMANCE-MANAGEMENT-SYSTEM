import java.util.ArrayList;

public class ReportGenerator {

    public static void generateReport(
            ArrayList<Student> students) {

        System.out.println("\n========== PERFORMANCE REPORT ==========");

        if (students.isEmpty()) {

            System.out.println("No student records available.");
            return;
        }

        int studentsWithMarks = 0;
        int passedStudents = 0;
        int failedStudents = 0;

        double totalPercentage = 0;
        double highestPercentage = -1;
        double lowestPercentage = 101;

        String highestStudent = "";
        String lowestStudent = "";

        for (Student student : students) {

            if (student.getMarks() != null) {

                studentsWithMarks++;

                double percentage =
                        student.getMarks().getPercentage();

                totalPercentage += percentage;

                if (percentage >= 40) {

                    passedStudents++;

                } else {

                    failedStudents++;
                }

                if (percentage > highestPercentage) {

                    highestPercentage = percentage;
                    highestStudent = student.getName();
                }

                if (percentage < lowestPercentage) {

                    lowestPercentage = percentage;
                    lowestStudent = student.getName();
                }
            }
        }

        System.out.println("----------------------------------------------");
        System.out.println("Total Students       : " + students.size());
        System.out.println("Students with Marks  : " + studentsWithMarks);
        System.out.println("Passed Students      : " + passedStudents);
        System.out.println("Failed Students      : " + failedStudents);

        if (studentsWithMarks > 0) {

            double average =
                    totalPercentage / studentsWithMarks;

            System.out.printf(
                    "Class Average        : %.2f%%\n",
                    average
            );

            System.out.printf(
                    "Highest Percentage   : %.2f%% (%s)\n",
                    highestPercentage,
                    highestStudent
            );

            System.out.printf(
                    "Lowest Percentage    : %.2f%% (%s)\n",
                    lowestPercentage,
                    lowestStudent
            );
        }

        System.out.println("----------------------------------------------");
    }
}