import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("The value of length is:");
        double l = in.nextDouble();

        System.out.println("The value of breath is:");
        double b = in.nextDouble();
//        Area = (length * breath)/2;
       double area = (l * b) / 2;
        System.out.println("The value of area is:" + area);
    }
}
