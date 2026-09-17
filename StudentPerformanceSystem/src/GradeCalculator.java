public class GradeCalculator {

    public static String calculateGrade(double percentage) {

        if (percentage >= 90) {
            return "A+";
        }
        else if (percentage >= 80) {
            return "A";
        }
        else if (percentage >= 70) {
            return "B";
        }
        else if (percentage >= 60) {
            return "C";
        }
        else if (percentage >= 50) {
            return "D";
        }
        else {
            return "F";
        }
    }

    public static String calculateResult(double percentage) {

        if (percentage >= 40) {
            return "PASS";
        }
        else {
            return "FAIL";
        }
    }
}