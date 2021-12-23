import tutorial.Client;
import tutorial.Server;

public class Main {
    public static void main(String[] args) {

        Server server = new Server(2300);
        System.out.println(server.getServer().getInetAddress());

        Client client = new Client(server.getServer().getInetAddress(), 2300);
        client.sendMessage("Hello Server");

        server.receiveMessage();
    }
}
