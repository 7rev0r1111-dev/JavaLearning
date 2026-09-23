public class LessonTest3 {
    public static void main(String[] args) {
        String answer = checkEmail("trevor@gmail.com");
        System.out.println(answer);
    }
    public static String checkEmail(String email) {
        if (email.contains("@")) {
        return "Valid";
        }
    return "Invalid";
    
}
}