import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("Alice",95);
        scores.put("Bob",82);
        scores.put("Charlie",78);
        System.out.println("Bobs score:"+scores.get("Bob"));
    }
    
}
