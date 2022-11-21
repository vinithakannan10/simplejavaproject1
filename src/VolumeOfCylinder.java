import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of radius:");
        double r = in.nextDouble();

        System.out.println("Enter the value of Height:");
        double h = in.nextDouble();
        double volume = ((22*r*r*h)/7);
        System.out.println("Volume of Cyclinder:"+volume);
    }
}
