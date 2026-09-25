package week_4.assignment_problems;

class WashingMachine extends Appliance {

    WashingMachine(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println(
            brand + " washing machine is ON"
        );
    }

    @Override
    void turnOff() {
        System.out.println(
            brand + " washing machine is OFF"
        );
    }
}

class Refrigerator extends Appliance {

    Refrigerator(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println(
            brand + " refrigerator is ON"
        );
    }

    @Override
    void turnOff() {
        System.out.println(
            brand + " refrigerator is OFF"
        );
    }
}

public abstract class Appliance {

    String brand;

    Appliance(String brand) {
        this.brand = brand;
    }

    abstract void turnOn();

    abstract void turnOff();

    public static void main(String[] args) {

        Appliance[] appliances = {
            new WashingMachine("LG"),
            new Refrigerator("Samsung")
        };

        for (Appliance appliance : appliances) {
            appliance.turnOn();
            appliance.turnOff();
        }
    }
}