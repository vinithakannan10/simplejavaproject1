import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of units:");
        int u = in.nextInt();
        if(u<=100) {
            int amount = u * 5;
            System.out.println(" BillPay:" + amount);
        }
            else if (u>=101&&u<=200) {
            int amount = (100 * 5) + (u - 100) * 7;
            System.out.println("BilPay:" + amount);
        }
            else if(u>=201&&u<=300) {
            int amount = (100 * 5 + 200 * 7) + (u - 200) * 10;
            System.out.println("BillPay:" + amount);
        }
            else{
            int amount = (100 * 5 + 200 * 7+300*10) + (u - 300) * 15;
            System.out.println("BillPay:" + amount);
            }
        }
    }

