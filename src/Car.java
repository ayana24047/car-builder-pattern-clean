public class Car {
    private String brand;
    private String model;
    private int year;
    private String engine;
    private boolean hasGPS;

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setEngine(String engine) { this.engine = engine; }
    public void setHasGPS(boolean hasGPS) { this.hasGPS = hasGPS; }

    @Override
    public String toString() {
        return "Car {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine='" + engine + '\'' +
                ", hasGPS=" + hasGPS +
                '}';
    }
}
