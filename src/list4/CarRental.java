package list4;

public class CarRental {

    public static void main(String[] args){

        Car car1 = new Car ("Volvo" , 210.50);
        Car car2 = new Car ( "Skoda", 190.30);

        System.out.println(car1.getName() + " costs " + car1.getDailyRentalPrice() + " SEK a day to rent.");
        System.out.println(car2.getName() + " costs " + car2.getDailyRentalPrice() + " SEK a day to rent.");

        int days = 5;
        System.out.println(car1.getName() + "costs " + car1.calculateRent(days) + " To rent for " + days + " days");
    }
}
