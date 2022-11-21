import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner on = new Scanner(System .in);
        System.out.println("enter the diagonals 1:");
        double d1 = on.nextDouble();

        System.out.println("enter the diagonals 2:");
        double d2 = on.nextDouble();

        double area = d1*d2/2;     //area = diagonals1*diagonals2/2
        System.out.println("area of rhombus is:"+area);
    }
}
