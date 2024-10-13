// Import the Scanner class for user input
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        // Declare variables to hold radius, area, and circumference
        double radius, area, circumference;
        
        // Declare constant for the value of PI
        final double PI = 3.14;
        
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        // Calculate the area of the circle: Area = π * r^2
        area = PI * radius * radius;
        
        // Calculate the circumference of the circle: Circumference = 2 * π * r
        circumference = 2 * PI * radius;

        // Print out the radius, area, and circumference with 2 decimal places
        System.out.printf("The radius is: %.2f\nThe area is: %.2f\nThe circumference is: %.2f\n", 
                          radius, area, circumference);
        
        // Close the scanner object to prevent resource leak
        input.close();
    }
}
