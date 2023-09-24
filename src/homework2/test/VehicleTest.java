import homework2.main.Car;
import homework2.main.Motorcycle;
import homework2.main.Vehicle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private final Car car = new Car("Porsche", "911", 2000);
    private final Motorcycle moto = new Motorcycle("Иж", "Юпитер", 1985);

    @Test
    @DisplayName("Экземпляр объекта Car также является экземпляром транспортного средства")
    public void carIsVehicle() {
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    @DisplayName("Машина имеет 4 колеса")
    public void carHas4Wheels() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    @DisplayName("Мотоцикл имеет два колеса")
    public void motoHas2Wheels() {
        assertEquals(2, moto.getNumWheels());
    }

    @Test
    @DisplayName("Машина развивает скорость 60 в режиме тестового вождения")
    public void carTestSpeedIs60() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    @DisplayName("Мотоцикл развивает скорость 75 в режиме тестового вождения")
    public void motoTestSpeedIs75() {
        moto.testDrive();
        assertEquals(75, moto.getSpeed());
    }

    @Test
    @DisplayName("Машина останавливается в режиме парковки")
    public void carParkSpeedIs0() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    @DisplayName("Мотоцикл останавливается в режиме парковки")
    public void motoParkSpeedIs0() {
        moto.testDrive();
        moto.park();
        assertEquals(0, moto.getSpeed());
    }
}