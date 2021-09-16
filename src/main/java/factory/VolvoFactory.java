package factory;

import model.Car;

public class VolvoFactory implements CarFactory{

    private static final String brand= "Volvo";
    private static final String motor= "VolvoMotor";

    @Override
    public Car CreateCar(String color) {
        return new Car(brand, color, motor);
    }
}
