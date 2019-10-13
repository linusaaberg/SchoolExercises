package exercise;
import java.util.Scanner;
public class E5_1 {

    public static void main(String [] arg){

        Scanner scanner = new Scanner(System.in);
        double [] temperatures = new double[5];
        System.out.print("Please enter 5 temperatures: ");

        for (int i = 0; i < temperatures.length; i++){
            System.out.print("Please enter temperature no." + (i+1) + " ");
            temperatures [i] = scanner.nextDouble();
            scanner.nextLine();
        }

        double highestTemperature = Integer.MIN_VALUE;
        for(int i = 0; i < temperatures.length; i++){
            double currentTemperature = temperatures[i];
            if (currentTemperature > highestTemperature){
                highestTemperature = currentTemperature;
            }
        }
        double lowestTemperature = Integer.MAX_VALUE;
        for (int i = 0; i < temperatures.length; i++){
            double currentTemperature = temperatures[i];
            if (currentTemperature < lowestTemperature){
                lowestTemperature = currentTemperature;
            }
        }
        System.out.println("Lowest: " + lowestTemperature + " Highest: " + highestTemperature);
        for(int i = 0; i < temperatures.length; i++){
            System.out.println(temperatures[i] );
        }


    }

}
