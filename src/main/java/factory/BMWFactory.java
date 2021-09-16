package factory;

import model.Car;

public class BMWFactory implements CarFactory{

    private static final String brand= "BMV";
    private static final String motor= "BMVMotor";

    @Override
    public Car CreateCar(String color) {
        return new Car(brand, color,motor);
    }
}
