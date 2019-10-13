package list2;
import java.util.Scanner;
public class Exercise4 {

    public static String isDevisible(int n, int x, int y){

        String notDevisble;
        if ((n % x) != 0 && (n % y != 0)){
           notDevisble = (n + " is not dibble by " + x + " or " +y);
           return notDevisble;
        }else if ((n & x ) > 0) {
            notDevisble = (n + " is divisible by " + x + "but not " +y);
            return notDevisble;
        }else if ((n % y) > 0) {
            notDevisble = (n + " is divisible by " + y + "but not " + x);
            return notDevisble;
        }else
            notDevisble = (n + " is divisible by " + x + " and " + y);
            return notDevisble;
    }

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        int n;
        int x;
        int y;

        System.out.print("Hello please enter which number you want to check: ");
        n = scanner.nextInt();

        System.out.print("Please enter the first number you would like to check " + n + " with: ");
        x = scanner.nextInt();

        System.out.print("Please enter the second number you would like to check " + n + " with: ");
        y = scanner.nextInt();

        String out = isDevisible(n,x,y);
        System.out.println(out);

        scanner.close();


    }

}
