import java.util.Scanner;

class CircleOperations {

    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);

        sc.close();
    }
}