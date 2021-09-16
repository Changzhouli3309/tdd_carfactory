import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import factory.BMWFactory;
import factory.CarFactory;
import factory.VolvoFactory;
import model.Car;

public class CarFactoryTest {

    private static CarFactory volvoFac;
    private static CarFactory bMVFac;

    {
        volvoFac = new VolvoFactory();
        bMVFac = new BMWFactory();
    }

    private static Stream<Arguments> argsForFactory() {
        //int regNumber, String brand, String color, String motor
        return Stream.of(
                Arguments.of(0, "Volvo", "red","VolvoMotor"),
                Arguments.of(1, "BMV", "black","BMVMotor"),
                Arguments.of(2, "Volvo", "white","VolvoMotor")
        );
    }

    @ParameterizedTest
    @MethodSource("argsForFactory")
    public void factory_test(int regNumber, String brand, String color, String motor) {

        Car car;

        switch (brand) {
            case "Volvo" -> car = volvoFac.CreateCar(color);
            case "BMV" -> car = bMVFac.CreateCar(color);
            default -> throw new IllegalStateException("Unexpected value: " + brand);
        }

        assertEquals(regNumber, car.getRegNumber());
        assertEquals(brand, car.getBrand());
        assertEquals(color, car.getColor());
        assertEquals(motor, car.getMotor());
    }
}
