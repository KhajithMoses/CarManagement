public final class Truck extends Car {
    public Truck(CarSpecification spec) {
        super(spec); // Pass the CarSpecification record
    }

    @Override
    public void soundHorn() {
        System.out.println("Truck horn sound!");
    }
}