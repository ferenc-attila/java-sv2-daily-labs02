package day04;

public class Car {

    int gasQuantity;
    int km;

    public double getConsumption() {
        return (gasQuantity * 1.0 / km) * 100;
    }

    public int getGasQuantity() {
        return gasQuantity;
    }

    public int getKm() {
        return km;
    }

    public void setGasQuantity(int gasQuantity) {
        this.gasQuantity = gasQuantity;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
