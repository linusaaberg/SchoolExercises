package list1;

import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 0 - 1000");

        int input = scanner.nextInt();
        int one = input%10;
        System.out.println(one);
        int two = (input/10)/10;
        System.out.println(two);
        int three = (input/10)%10;
        System.out.println(three);
        System.out.println(one+two+three);

        scanner.close();
            }
}
