import java.util.Scanner;

public class SurfaceAreaOfCuboid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of cuboid:");
                double l = in.nextDouble();

                System.out.println("enter the breath of cuboid:");
                double b = in.nextDouble();

                System.out.println("enter the height of cuboid:");
                double h = in.nextDouble();


                double surfaceArea = (2*((l*b)+(b*h)+(h*l)));
                System.out.println("surface Area of cuboid is:"+ surfaceArea);
                }
                }



