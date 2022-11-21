import java.util.Scanner;

public class VolumeOfSphere {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("enter the value of radius:");
       double r = in.nextDouble();
       double volume = (4*22*r*r*r)/(3*7);
       System.out.println("volume of sphere is:"+volume);

   }
   }
