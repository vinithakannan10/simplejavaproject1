import java.util.Scanner;

public class SurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of side:");
        double side = in.nextDouble();
        double radius = 4*side*side;
        System.out.println("surface area of cube is:"+radius);


    }
}
