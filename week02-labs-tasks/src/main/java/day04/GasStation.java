package day04;

public class GasStation {

    int gasPrice;

    public GasStation(int gasPrice) {
        this.gasPrice = gasPrice;
    }

    public int refueling(Car car, int liter) {
        car.setGasQuantity(liter);
        return liter*gasPrice;
    }
}
