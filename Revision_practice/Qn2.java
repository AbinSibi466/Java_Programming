package Revision_practice;

public class Qn2 {
     public static void main(String[] args) {
        String sentence = "Betty bought some butter";

        String[] words = sentence.split(" ");

        System.out.println("Words in the sentence:");

        for (String word : words) {
            System.out.println(word);
        }
    }
}


