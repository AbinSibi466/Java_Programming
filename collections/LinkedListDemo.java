import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("First elemt :"+ colors.getFirst());
         System.out.println("Last elemt :"+ colors.getLast());
         colors.addFirst("Yellow");
         colors.addLast("Purple");
         colors.removeFirst();
         colors.removeLast();
         for(String color : colors){
            System.out.println(color);
         }
    }
}
