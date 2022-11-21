import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the side of equilateralTriangle:");
        double s = in.nextDouble();
        double area = (Math.sqrt(3)/4)*(s*s);
        System.out.println("The area of equilateralTriangle is:"+area);
    }
}
