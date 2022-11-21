import java.util.Scanner;

public class CalculateCompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double principal;
        double rate;
        double amount;
        double time;
        System.out.println("enter the principal amount is:");
         principal = in.nextDouble();

        System.out.println("enter the rate is:");
        rate = in.nextDouble();

        System.out.println("enter the amount is:");
        amount = in.nextDouble();

        System.out.println("enter the time is:");
        time = in.nextDouble();

        //compoundinterest formula
        // amount = principal*(1+rate/100)^time

        amount = principal* Math.pow((1+rate/100),time);
        System.out.println("Value of compound interest is:"+amount);

    }
}
