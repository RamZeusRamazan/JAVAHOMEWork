import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Activites14_2 {
    public static void main(String[] args) throws IOException {

        Socket clientSocket =new Socket("127.0.0.1",7173);

        DataInputStream dataInputStream =new DataInputStream(clientSocket.getInputStream());
        System.out.println(dataInputStream.readUTF());
    }
}
