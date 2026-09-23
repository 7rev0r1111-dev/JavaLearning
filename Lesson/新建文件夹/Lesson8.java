public class Lesson8{
    public static void main(String[] args) {
        int[] scores = {78,92,85,60,99};
        int sum = 0;
        double average = 0.0;
        int max = scores[0];
        int min = scores[0];

        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }

        }
        average = (double) sum / scores.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}