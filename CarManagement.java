import java.util.ArrayList;
import java.util.List;

public class CarManagement implements CarUtils {
    private List<Car> cars;
    private Car[] carArray; // Array to store cars

    public CarManagement() {
        this.cars = new ArrayList<>();
        this.carArray = new Car[10]; // Initialize an array with a size of 10
    }

    public void addCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        }
        cars.add(car);
    }

    // Method Overloading: Add multiple cars using varargs
    public void addCars(Car... carsToAdd) {
        for (var car : carsToAdd) { // Using var for local variable
            addCar(car); // Reuse the existing addCar method
        }
    }

    public void displayCars() {
        displayCars(cars); // Calls the default method from CarUtils
    }

    public List<Car> filterCarsByModel(String model) {
        return cars.stream()
                .filter(car -> car.getModel().equalsIgnoreCase(model))
                .toList(); // Using Java 16+ method
    }

    public void displayCarDescriptions() {
        for (var car : cars) { // Using var for local variable
            System.out.println(car.getDescription());
        }
    }
}