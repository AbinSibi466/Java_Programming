package labEx1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class MethodsJ {
    public static void main(String[] args) {
        printStringLength();
        printUppercaseString();
        sortArray();
        manipulateArrayList();
        findMaxNumber();
        readUserInput();
        checkFileExists();
    }

    public static void printStringLength() {
        String text = "Java Programming";
        int length = text.length();
        System.out.println("Length of the string: " + length);
    }

    public static void printUppercaseString() {
        String text = "java programming";
        String upperCaseText = text.toUpperCase();
        System.out.println("Uppercase: " + upperCaseText);
    }

    public static void sortArray() {
        int[] numbers = {5, 2, 9, 1, 5};
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }

    public static void manipulateArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("ArrayList: " + list);
    }

    public static void findMaxNumber() {
        int num1 = 10;
        int num2 = 20;
        int maxNum = Math.max(num1, num2);
        System.out.println("Maximum number: " + maxNum);
    }

    public static void readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);
    }

    public static void checkFileExists() {
        File file = new File("example.txt");
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}

