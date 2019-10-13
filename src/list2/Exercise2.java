package list2;
import java.util.Scanner;
public class Exercise2 {

    public static double thirdLenght(double num1, double num2){

        double third = 180 - (num1 + num2);
        return third;
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first sides of the triangle: ");
        double input1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Please enter second side of the triangle: ");
        double input2 = scanner.nextDouble();
        scanner.nextLine();

        double third = thirdLenght(input1, input2);

        System.out.println("The third side of the triangle is: " + third);

        scanner.close();

    }
}
