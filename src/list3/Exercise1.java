package list3;

import java.util.Scanner;
import java.lang.*;
public class Exercise1 {

    public static int calcDigits(String user){
        String[] splice = user.split("");

        for (int i = 0; i < splice.length; i++){
            splice.isDigit(i)
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Type the string: ");

        System.out.println("The value of the digit in your string is " + calcDigits(input.nextLine()));
    }
}
