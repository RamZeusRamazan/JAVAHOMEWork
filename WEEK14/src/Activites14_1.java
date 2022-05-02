import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Activites14_1 {
    static int i=0;
    public static void main(String[] args) throws IOException {
        ServerSocket server =new ServerSocket(7173);

        while(true) {
            Socket serverSocket = server.accept();
            i++;
            DataOutputStream dataOutputStream =new DataOutputStream(serverSocket.getOutputStream());
            dataOutputStream.writeUTF("You are visitor "+i+"");
            dataOutputStream.flush();
            dataOutputStream.close();
        }
    }
}
