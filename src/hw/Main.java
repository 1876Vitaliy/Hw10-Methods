package hw;

import java.util.Scanner;

public class Main {

    private static final String CURRENCY = "EUR";
    static double discount;
    static double totalSum;
    static double price;

    public static void main(String[] args) {

        System.out.print("Enter the price of the product: ");

        Scanner sc = new Scanner(System.in);
        price = sc.nextDouble();

        showSumm();
        discount(price);
        Total();
    }

    private static void showSumm() {
        System.out.printf("Your enter price of the product: %.2f %s %n", price, CURRENCY);
    }

    private static void discount(double price) {

        if (price > 0 & price <= 5000) {
            discount = (price * 5) / 100;
            totalSum = calculatePrice(discount, price);
            showDiscont();
        } else { if (price > 5000 & price <= 10000) {
            discount = (price * 10) / 100;
            totalSum = calculatePrice(discount, price);
            showDiscont();
        } else { if (price > 10000) ;
            discount = (price * 15) / 100;
            totalSum = calculatePrice(discount, price);
            showDiscont();
        }
        }
    }

    private static void showDiscont() {

        System.out.printf("Your discount: %.2f %s %n", discount, CURRENCY);
    }

    private static double calculatePrice(double disc, double sum) {
        return sum - disc;
    }

    private static void Total() {
        System.out.printf("Total payable: %.2f %s", totalSum, CURRENCY);
    }
}