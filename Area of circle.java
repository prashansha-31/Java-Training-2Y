public class CircleArea {
    public static void main(String[] args) {   
        java.io.Console console = System.console();
        if (console == null) {
            System.out.println("Console not available. Please run from a terminal.");
            return;
        }
        String input = console.readLine("Enter the radius of the circle: ");
        double radius = Double.parseDouble(input);
        double area = 3.141592653589793 * radius * radius;
        System.out.printf("The area of the circle with radius %.2f is %.4f%n", radius, area);
    }
}
