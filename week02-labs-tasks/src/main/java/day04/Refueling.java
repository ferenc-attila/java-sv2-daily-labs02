package day04;

public class Refueling {

    public static void main(String[] args) {

        Car car = new Car();
        GasStation gasStation = new GasStation(500);

        System.out.println("The price of refueling: " + gasStation.refueling(car, 50));
        car.setKm(672);

        System.out.println("The consumption: " + car.getConsumption());
    }
}
