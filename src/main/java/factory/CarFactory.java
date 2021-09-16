package factory;

import model.Car;

public interface CarFactory {

    Car CreateCar(String color);
}
