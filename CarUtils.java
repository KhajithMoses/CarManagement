import java.util.List;

public interface CarUtils {
    static void printCarDetails(Car car) {
        System.out.println("Car Model: " + car.getModel() + ", Year: " + car.getYear() + ", Type: " + car.getType());
    }

    default void displayCars(List<Car> cars) {
        cars.forEach(this::printCarAndSoundHorn); // Using method reference
    }

    private void printCarAndSoundHorn(Car car) {
        printCarDetails(car);
        car.soundHorn();
    }
}