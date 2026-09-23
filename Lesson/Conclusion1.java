import java.util.Scanner;

public class Conclusion1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = {"Trevor", "Alice", "Bob"};
        int[] scores = {85, 92, 58};

        System.out.print("Enter a student name: ");
        String target = input.nextLine().trim();


        boolean found = false;
        int foundIndex = -1;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(target)) {
                found = true;
                foundIndex = i;
                break;
            }
        }

        if (found) {

            String name = names[foundIndex];
            int score = scores[foundIndex];

            char firstLetter = name.charAt(0);

            System.out.println("Name: " + name);
            System.out.println("First letter: " + firstLetter);
            System.out.println("Score: " + score);
            System.out.println("Grade: " + getGrade(score));

        } else {
            System.out.println("Student not found.");
        }
    }

    public static String getGrade(int score) {

        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 60) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}