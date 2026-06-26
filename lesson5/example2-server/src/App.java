import udp.UdpServer;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=========================== SERVER ===========================");
        UdpServer server = new UdpServer(3030);
        server.initServer();
    }
}
