package list1;

import java.util.Scanner;
public class NameAndAge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what is your first name?");

        String name = scanner.next();

        System.out.println("In what year was you born " + name + "?");

        int birthYear = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How tall are you " + name + "?");

        int height = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How much do you weight " + name + "?");

        int weight = scanner.nextInt();
        scanner.nextLine();

        System.out.println ("Your name is " + name + ". You where born in the year " + birthYear + ". Your height is " + height + " and you weight " + weight + ".");

        scanner.close();
    }
}
