
public class Main {

    static final int MIN_PASSING_GRADE = 40;

    public static double calculateAverage(int[] marks) {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    public static String getEvaluation(double average) {
        if (average < MIN_PASSING_GRADE) {
            return "Unsatisfactory";
        } else if (average < 60) {
            return "Good";
        } else if (average < 80) {
            return "Very good";
        } else {
            return "Excellent";
        }
    }

    public static void main(String[] args) {

        String[] studentNames = {"Anil", "Janis"};

        int[][] studentMarks = {{98, 85, 73},{48, 52, 65}};

        double average1 = calculateAverage(studentMarks[0]);
        double average2 = calculateAverage(studentMarks[1]);

        System.out.println(studentNames[0] + ": " + String.format("%.2f", average1) + " - " + getEvaluation(average1));
        System.out.println(studentNames[1] + ": " + String.format("%.2f", average2) + " - " + getEvaluation(average2));
    }
}
