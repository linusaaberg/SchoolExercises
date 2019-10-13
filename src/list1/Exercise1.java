package list1;

import java.util.Scanner;

public class Exercise1 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the temperature in celsius.");

        int celsius = scanner.nextInt();
        int fharenheit = (9 / 5) * celsius + 32;
        String f = "F";
        System.out.println(celsius + " celsius is " + fharenheit + f);
    }
}
