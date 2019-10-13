package list4;

public class Car {

    String name;
    double dailyRentalPrice;

    public Car(String name, double dailyRentalPrice){

        this.name = name;
        this.dailyRentalPrice = dailyRentalPrice;

    }

    public String getName(){
        return name;
    }

    public double getDailyRentalPrice(){
        return dailyRentalPrice;
    }
    public double calculateRent(double days){

       double price = dailyRentalPrice * days;
       return price;
    }
}
