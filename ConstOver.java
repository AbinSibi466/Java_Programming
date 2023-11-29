public class ConstructorOverloadingDemo {
    private int number;
    private String text;

    // Constructor with no parameters
    public ConstructorOverloadingDemo() {
        number = 0;
        text = "Default";
    }

    // Constructor with two parameters
    public ConstructorOverloadingDemo(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        ConstructorOverloadingDemo obj1 = new ConstructorOverloadingDemo();
        ConstructorOverloadingDemo obj2 = new ConstructorOverloadingDemo(42, "Hello, Overloading!");

        System.out.println("Object 1:");
        obj1.display();

        System.out.println("Object 2:");
        obj2.display();
    }
}
