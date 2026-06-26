import udp.UdpClient;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("================= Client ==============");
        UdpClient udpClient = new UdpClient("127.0.0.1", 3030);
        udpClient.initConection();
    }
}
