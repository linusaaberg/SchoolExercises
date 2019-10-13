package list2;
import java.util.Scanner;
public class Exercise3 {
    //Method to determine if alarm should be set or not
    public static boolean setAlarm (boolean employed, boolean vacation ) {
        if (employed && !vacation) {
            return true;
        } else return false;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);



        boolean employed = true;
        boolean vacation = true;

        System.out.println("Are you employed? ");
        String in = scanner.nextLine();
        if ( in.equals( "No") ) {
            employed = false;
        }

        System.out.print("Are you on vacation? ");
        in = scanner.nextLine();
        if (in.equals("No") ) {
            vacation = false;
        }
        boolean alarm = setAlarm(employed, vacation);
        scanner.close();
        System.out.println(alarm);

    }
}
