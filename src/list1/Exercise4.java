package list1;
import java.util.Scanner;
public class Exercise4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter driving distance: ");
        double distance = scanner.nextDouble();
        scanner.nextLine();

        System.out.print ("Please enter km per gallon: ");
        double kmGallon = scanner.nextDouble();
        scanner.nextLine();

        System.out.print ("Please enter price per gallon: ");
        double priceGallon = scanner.nextDouble();
        scanner.nextLine();

        double cost = (distance/100) * kmGallon * priceGallon;

        System.out.println("The cost of your driving is: " + cost);

        scanner.close();;



    }
}
