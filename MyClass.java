public class MyClass {
    private int number;
    private String text;

    public MyClass() {
        number = 0;
        text = "Default Text";
    }

    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}