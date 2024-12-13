public sealed class Car permits Sedan, SUV, Truck {
    private final String model;
    private final int year;
    private final CarType type; // Add car type

    public Car(CarSpecification spec) {
        this.model = spec.model();
        this.year = spec.year();
        this.type = spec.type();
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public CarType getType() {
        return type; // Getter for car type
    }

    public void soundHorn() {
        System.out.println(model + " goes honk!");
    }

    public String getDescription() {
        return switch (this) {
            case Sedan s -> "This is a sedan: " + s.getModel();
            case SUV s -> "This is an SUV: " + s.getModel();
            case Truck t -> "This is a truck: " + t.getModel();
            default -> "Unknown car type"; // Default case added
        };
    }
}