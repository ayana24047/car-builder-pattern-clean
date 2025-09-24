public class SportsCarBuilder implements CarBuilder {
    private Car car;

    public SportsCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void setBrand(String brand) { car.setBrand(brand); }

    @Override
    public void setModel(String model) { car.setModel(model); }

    @Override
    public void setYear(int year) { car.setYear(year); }

    @Override
    public void setEngine(String engine) { car.setEngine(engine); }

    @Override
    public void setHasGPS(boolean hasGPS) { car.setHasGPS(hasGPS); }

    @Override
    public Car build() { return car; }
}
