public class Lesson81 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 25, 9, 18};
        int target = 9;
        boolean found = false;
        int foundIndex = -1;

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                foundIndex = i;
                break;
            }
        }
        if (found) {
            System.out.println("Found at index: " + foundIndex);
        } else {
            System.out.println("Not found");
        }
    }
}       