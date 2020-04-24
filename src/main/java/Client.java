import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static double multiple(double a, double b) throws IOException {

        try (Socket socket = new Socket("127.0.0.1", 5000);

             DataInputStream inputStream = new DataInputStream(socket.getInputStream());
             DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());) {
            outputStream.writeDouble(a);
            outputStream.writeDouble(b);
            outputStream.flush();
            return inputStream.readDouble();
        }

    }

}
