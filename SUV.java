public final class SUV extends Car {
    public SUV(CarSpecification spec) {
        super(spec); // Pass the CarSpecification record
    }

    @Override
    public void soundHorn() {
        System.out.println("SUV horn sound!");
    }
}