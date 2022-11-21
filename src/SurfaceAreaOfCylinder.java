import java.util.Scanner;

public class SurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius of cylinder:");
        double r = in.nextDouble();

        System.out.println("enter the height of cylinder:");
        double h = in.nextDouble();

        double surfaceArea = ((2*22*r)/7*(r+h));
        System.out.println("surface Area of cylinder is:"+ surfaceArea);
    }
}




