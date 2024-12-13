import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarManagement carManagement = new CarManagement();

        // Adding cars using the CarSpecification record with CarType
        carManagement.addCar(new Sedan(new CarSpecification("Toyota Camry", 2020, CarType.SEDAN)));
        carManagement.addCar(new SUV(new CarSpecification("Honda CR-V", 2019, CarType.SUV)));
        carManagement.addCar(new Truck(new CarSpecification("Ford F-150", 2021, CarType.TRUCK)));

        // Adding multiple cars using varargs with CarType
        carManagement.addCars(
            new Sedan(new CarSpecification("Nissan Altima", 2022, CarType.SEDAN)),
            new SUV(new CarSpecification("Chevrolet Tahoe", 2020, CarType.SUV))
        );

        // Displaying all cars
        System.out.println("All Cars:");
        carManagement.displayCars();

        // Displaying descriptions of all cars
        System.out.println("\nCar Descriptions:");
        carManagement.displayCarDescriptions();

        // Filtering cars by model
        List<Car> filteredCars = carManagement.filterCarsByModel("Honda CR-V");
        System.out.println("\nFiltered Cars (Honda CR-V):");
        filteredCars.forEach(CarUtils::printCarDetails);
    }
}