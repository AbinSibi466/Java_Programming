package labEx2;

public class MethEx2 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello, ");

        stringBuffer.append("World!");

        stringBuffer.insert(7, "AbinSibi ");

        System.out.println("Current Content: " + stringBuffer);

        stringBuffer.replace(7, 15, "Abin ");

        stringBuffer.delete(0, 6);

        System.out.println("Modified Content: " + stringBuffer);

        char charAtIndex = stringBuffer.charAt(2);
        System.out.println("Character at index 2: " + charAtIndex);

        stringBuffer.setCharAt(2, 'X');
        System.out.println("Modified Content after setCharAt: " + stringBuffer);

        int length = stringBuffer.length();
        System.out.println("Length of the content: " + length);

        int capacity = stringBuffer.capacity();
        System.out.println("Capacity of the StringBuffer: " + capacity);

        stringBuffer.ensureCapacity(50);

        String convertedString = stringBuffer.toString();
        System.out.println("Converted to String: " + convertedString);

        String substringFromIndex = stringBuffer.substring(6);
        System.out.println("Substring from index 6: " + substringFromIndex);

        String substringInRange = stringBuffer.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substringInRange);
    }
}
