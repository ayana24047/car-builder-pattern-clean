public class Main {
    public static void main(String[] args) {
        System.out.println("Запуск из Main");

        // Создаём клиента и запускаем метод run()
        Client client = new Client();
        client.run();
    }
}
