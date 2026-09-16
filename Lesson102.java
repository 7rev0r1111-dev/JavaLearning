public class Lesson102 {
    public static void main(String[] args) {
        int[] nums = {-2, 5, 0, 7, -1, 9};
        int countNegative = countNegative(nums);
        System.out.println(countNegative);
    }
    public static int countNegative(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                count++;
            }
        }
        return count;
    }
}