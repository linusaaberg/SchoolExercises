package list2;
import java.util.Scanner;
public class Exercise6 {

    public static void main(String[] args) {
        int score = 0;
        Scanner input = new Scanner(System.in);

        System.out.println(" Are you ready for a quiz? (Y/N)");
        if (input.nextLine().equalsIgnoreCase("Y")){

            System.out.println(" Q1) What is the capital of of Albania? \n " +
                    " 1) Sofia \n " +
                    " 2) Tirana \n " +
                    " 3) Budapest \n ");
            if ( input.nextInt() == 2){
                input.nextLine();
                System.out.println(" That is correct! ");
                score++;
            } else {
                input.nextLine();
                System.out.println(" Sorry the right answer was Tirana. ");
            }

            System.out.println(" Q2) Can you store the value \"dog\" in a variable of type int? \n " +
                     "1) Yes \n" +
                     "2) No \n ");
            if ( input.nextInt() == 2 ){
                input.nextLine();
                System.out.println("That is correct! ");
                score++;
            }else {
                input.nextLine();
                System.out.println("Sorry, \"dog\" is a string. ints can only store numbers. ");
            }

            System.out.println(" Q3) What is the result of 6+4/2? \n " +
                    " 1) 5 \n " +
                    " 2) 8 \n " +
                    " 3) 4 \n " );
            if ( input.nextInt() == 1){
                input.nextLine();
                System.out.println( " That is correct! ");
                score++;
            }else{
                input.nextLine();
                System.out.println(" Sorry, \"6+4/2\" is 5. ");
            }
        }

        System.out.println(" Thanks for playing! \n" +
                " Your score is: " + score);
        input.close();
    }
}
