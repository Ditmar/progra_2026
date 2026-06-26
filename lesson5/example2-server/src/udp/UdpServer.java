package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpServer {
    private Integer port;

    public UdpServer(Integer port) {
        this.port = port;
    }

    public void initServer() {
        try (DatagramSocket socket = new DatagramSocket(this.port)) {
            System.out.println("Server listen in port " + this.port);
            byte[] buffer = new byte[1024];
            while (true) {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                System.out.println("Waiting messages");
                socket.receive(packet);
                System.out.println("Messages receive");
                String messages = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Client says: " + messages);
                InetAddress clInetAddress = packet.getAddress();
                Integer clientPort = packet.getPort();
                String serverResponse = "server, Message received";
                byte[] serverResponseBytes = serverResponse.getBytes();
                DatagramPacket responseDatagramPacket = new DatagramPacket(serverResponseBytes, serverResponse.length(),
                        clInetAddress, clientPort);
                socket.send(responseDatagramPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
