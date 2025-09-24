public class Client {
    public void run() {
        // Используем SimpleCarBuilder
        CarBuilder simpleBuilder = new SimpleCarBuilder();
        CarDirector director = new CarDirector(simpleBuilder);

        Car simpleCar = director.constructSimpleCar();
        System.out.println("Простая машина: " + simpleCar);

        // Используем SportsCarBuilder
        CarBuilder sportsBuilder = new SportsCarBuilder();
        director.setBuilder(sportsBuilder);

        Car sportsCar = director.constructSportsCar();
        System.out.println("Спортивная машина: " + sportsCar);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}
