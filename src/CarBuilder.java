public interface CarBuilder {
    void setBrand(String brand);
    void setModel(String model);
    void setYear(int year);
    void setEngine(String engine);
    void setHasGPS(boolean hasGPS);

    Car build();
}

