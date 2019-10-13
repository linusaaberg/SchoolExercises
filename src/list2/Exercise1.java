package list2;
import java.util.Scanner;
public class Exercise1 {
    //Method to make an int negative
    public static int makeNegative (int num1){
        int negative = num1 * (-1);
        return negative;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please typ a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        int negative = makeNegative(number);

        System.out.println("Your number in negative are: " + negative);

        scanner.close();

    }
}
