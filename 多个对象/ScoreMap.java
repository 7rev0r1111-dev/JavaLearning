import java.util.HashMap;

public class ScoreMap {
    public static void main(String[] args) {

    HashMap<String, Integer> scores = new HashMap<>();
    scores.put("Trevor", 85);
    scores.put("Alice", 92);
    scores.put("Bob", 78);

    System.out.println(scores.get("Trevor"));

    if (scores.containsKey("Alice")) {
        System.out.println("Alice exists");
    }

    scores.put("Bob", 88);
    scores.remove("Trevor", 85);

    System.out.println(scores);

    System.out.println(scores.size());
    }
}
