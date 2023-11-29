public class Interfacedemo {
    public static void main(String[] args) {
        // Instantiate RectanglePlus objects using different constructors
        RectanglePlus rectangle1 = new RectanglePlus(); // Default constructor
        RectanglePlus rectangle2 = new RectanglePlus(new Point(2, 3)); // Constructor with Point parameter
        RectanglePlus rectangle3 = new RectanglePlus(4, 5); // Constructor with width and height parameters
        RectanglePlus rectangle4 = new RectanglePlus(new Point(1, 1), 3, 4); // Constructor with all parameters

        // Display information about each rectangle
        displayRectangleInfo(rectangle1, "Rectangle 1");
        displayRectangleInfo(rectangle2, "Rectangle 2");
        displayRectangleInfo(rectangle3, "Rectangle 3");
        displayRectangleInfo(rectangle4, "Rectangle 4");

        // Move rectangle2 to a new position
        rectangle2.move(5, 5);
        displayRectangleInfo(rectangle2, "Rectangle 2 after moving");

        // Demonstrate the Relatable interface method
        int comparisonResult = rectangle3.isLargerThan(rectangle1);
        System.out.println("Comparison result between Rectangle 3 and Rectangle 1: " + comparisonResult);
    }

    // Helper method to display information about a rectangle
    private static void displayRectangleInfo(RectanglePlus rectangle, String name) {
        System.out.println(name + ":");
        System.out.println("   Origin: (" + rectangle.origin.x + ", " + rectangle.origin.y + ")");
        System.out.println("   Width: " + rectangle.width);
        System.out.println("   Height: " + rectangle.height);
        System.out.println("   Area: " + rectangle.getArea());
        System.out.println();
    }
}public class Interfacedemo {
    
}
