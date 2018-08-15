package facade;

public class Application {
    public static void main(String[] args) {
        Client client = new Client();
        client.share("Hello world");
    }
}
