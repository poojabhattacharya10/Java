import java.util.Scanner;

public class AreaOfCircle1 {
    public static double calculateCircleArea(double radius)
    {
        double area = 3.14159 * radius* radius;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println(calculateCircleArea(radius));
       sc.close();
    }

}
