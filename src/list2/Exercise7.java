package list2;

import java.util.Scanner;

public class Exercise7 {

    public static boolean integerCheck(int num){

        if ( num % 6 == 0 && num%5 == 0){
            return true;
        }else if (num%6 == 0 || num%5==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Please enter an integer: ");
        System.out.println(integerCheck(input.nextInt()));
    }
}
