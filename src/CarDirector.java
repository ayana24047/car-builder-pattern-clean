public class CarDirector {
    private CarBuilder builder;

    public CarDirector(CarBuilder builder) { this.builder = builder; }

    public void setBuilder(CarBuilder builder) { this.builder = builder; }

    public Car constructSimpleCar() {
        builder.setBrand("Toyota");
        builder.setModel("Corolla");
        builder.setYear(2022);
        builder.setEngine("1.6L");
        builder.setHasGPS(false);
        return builder.build();
    }

    public Car constructSportsCar() {
        builder.setBrand("Porsche");
        builder.setModel("911 Turbo");
        builder.setYear(2023);
        builder.setEngine("3.0L Turbo");
        builder.setHasGPS(true);
        return builder.build();
    }
}
