import java.util.Scanner;

public class FindAreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of width is:");
        double w = in.nextDouble();

        System.out.println("enter the value of height is:");
        double h = in.nextDouble();
        //area=(width*height)/2;
        double area = (w * h) / 2;
        System.out.println("The value of area is:" + area);
    }
}