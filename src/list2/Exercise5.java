package list2;
import java.util.Scanner;
public class Exercise5 {

    public static double calculateRide (double distance, boolean charge, String membership){

        //Method to calculate total fare of a voi-ride
        double totalFare;
        //Calculates Total fare depending on distance in km
        if (distance < 5){
            totalFare = distance * 20;
        } else if (distance <= 15){
            totalFare = distance * 15;
        } else
            totalFare = distance * 8;
        //Calculates total fare depending on if the user charged the bike or not
        if (charge = true){
            totalFare = totalFare - totalFare * 0.25;
        }else;
        //calculates total fare depending on membership
        if (membership.equals("Silver")){
            totalFare = totalFare * 0.90;
        }else if (membership.equals("Gold")){
            totalFare = totalFare * 0.80;
        }else if (membership.equals("Platinum")){
            totalFare = totalFare * 0.65;
        }else;

        return totalFare;
        }

    public static void main(String[] args){
        // declaring variables
        Scanner scanner = new Scanner (System.in);
        double distance;
        String charging;
        boolean charge;
        String membership;
        //User prompts
        System.out.print("Hello please enter distance traveled in km: ");
        distance = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Did you charge? \n" + "Yes \n" + "No \n");
        charging = scanner.nextLine();
        if (charging.equals("Yes") || charging.equals("yes")){
            charge = true;
        }else charge = false;

        System.out.print("What membership do you have?\n" + "None\n" + "Silver\n" + "Gold\n" + "Platinum\n");
        membership = scanner.nextLine();

        //invoking method
        double totalFare = calculateRide(distance,charge,membership);
        System.out.print("Your total fare is " + totalFare);
        scanner.close();
    }
}
