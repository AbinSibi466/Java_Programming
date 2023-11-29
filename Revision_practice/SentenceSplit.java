package Revision_practice;
public class SentenceSplit {
    public static void main(String[] args) {
        // Input sentence
        String sentence = "Betty bought some butter";

        // Split the sentence into an array using space as the delimiter
        String[] words = sentence.split(" ");

        // Display the words in the array
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
