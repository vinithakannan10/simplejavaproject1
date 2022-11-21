import java.util.Scanner;

public class FindAreaOfCircle {
    public static void main(String[] args) {
        float r,area;
        Scanner m = new Scanner(System.in);
        System.out.println("enter the radius value of:");
        r = m.nextFloat();
        area = (float) (22.0/7)*r*r; //(22*r*r)/7
        System.out.printf("area of cicle and radius %.4f ",r,area);

    }
}
