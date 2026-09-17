public class LessonTest2 {
    public static void main(String[] args) {
        String check = checkUsername("Trevor123");
        System.out.println(check);
    }
    public static String checkUsername(String name) {
        if (name.contains("Trevor")) {
        return "Valid";
    }
    return "Invalid";
    }
}
