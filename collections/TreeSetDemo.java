import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        System.out.println("First num:"+numbers.first());
    }
    
}
