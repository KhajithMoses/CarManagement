public final class Sedan extends Car {
    public Sedan(CarSpecification spec) {
        super(spec); // Pass the CarSpecification record
    }

    @Override
    public void soundHorn() {
        System.out.println("Sedan horn sound!");
    }
}