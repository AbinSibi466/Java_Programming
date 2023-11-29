public class WithParam {
    private int number;
    private String text;

    public WithParam (int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        WithParam obj = new WithParam (42, "Hello, World!");
        obj.display();
    }
}