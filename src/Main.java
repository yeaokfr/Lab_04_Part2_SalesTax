import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tax = 1.05;

        System.out.println("How much was the price of your item?");
        double price = scan.nextDouble();

        System.out.println("Your total today is $ " + price*tax);
    }
}