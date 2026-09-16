public class Lesson101 {
    public static void main(String[] args) {
        int number = getMax(12, 7);
        System.out.println(number);
    }
    public static int getMax(int a, int b) {
        if(a > b) {
            return a;

        } else if(a < b) {
            return b;
        }
        
            else {
                return a;
            }
        }
}
