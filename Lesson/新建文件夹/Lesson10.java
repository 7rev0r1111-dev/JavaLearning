public class Lesson10 {
    public static void main(String[] args) {
        String grade = getGrade(85);
        System.out.println(grade);
    }

    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "F";
        }
    }
}