package list1;

import java.util.Scanner;
public class Exercise2 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello what is the subtotal? ");

        double subTotal = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What is the gratuity rate?");

        double gratuityRate = scanner.nextDouble();
        scanner.nextLine();

        double gratuity = (gratuityRate*subTotal)/100;
        double total = subTotal + gratuity;

        System.out.print("Your gratuity is " + gratuity + " and your total is " + total + ".");

        scanner.close();

    }
}
