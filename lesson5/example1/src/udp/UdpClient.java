package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
    private String host;
    private Integer port;

    public UdpClient(String host, Integer port) {
        this.host = host;
        this.port = port;
    }

    public void initConection() {
        // hand shake
        try (DatagramSocket socket = new DatagramSocket()) {
            String message = "Hola servidor, soy un cliente udp  ";
            byte[] messageByte = message.getBytes();
            InetAddress serverAddress = InetAddress.getByName(this.host);
            DatagramPacket packet = new DatagramPacket(messageByte, messageByte.length, serverAddress, this.port);
            socket.send(packet);
            System.out.println("Mensaje enviado al servidor");
            // esperamos una respuesta del servidor
            byte[] buffer = new byte[1024];
            DatagramPacket serverResponse = new DatagramPacket(buffer, buffer.length);
            socket.receive(serverResponse);
            String response = new String(serverResponse.getData(), 0, serverResponse.getLength());
            System.out.println("Server response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
