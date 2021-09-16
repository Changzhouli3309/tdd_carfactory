package model;

public class Car {
    private static int startId = 0;
    private String brand, color, motor;
    private int regNumber;

    public Car(String brand, String color, String motor) {
        this.brand = brand;
        this.color = color;
        this.motor = motor;
        this.regNumber = startId++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getRegNumber() {
        return regNumber;
    }

}
