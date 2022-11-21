import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of radius:");
        double r = in.nextDouble();

        System.out.println("enter the value of height:");
        double h = in.nextDouble();

        double volume = (22*r*r*h)/(3*7);
        System.out.println("volume of cone is:"+volume);
        }
    }

