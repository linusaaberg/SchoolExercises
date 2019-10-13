package list1;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please write one word: ");
        String word = scanner.nextLine();

        int leanght = word.length();
        char one = word.charAt(0);
        char two = word.charAt(1);

        System.out.println("The leanght of your word is: " + leanght);
        System.out.println("The two first letters are: " + one +" and " + two);

        scanner.close();

    }
}
