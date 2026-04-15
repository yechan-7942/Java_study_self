import java.util.Scanner;

public class CircleCalculation2 {
    public static final double PI = 3.141592;

    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius");
        radius = input.nextDouble();
        area = PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}
