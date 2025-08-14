public class CircleArea {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the radius as a command-line argument.");
            return;
        }

        try {
            double radius = Double.parseDouble(args[0]);
            double area = Math.PI * radius * radius;
            System.out.printf("The area of the circle with radius %.2f is %.4f%n", radius, area);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value for the radius.");
        }
    }
}