import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    Socket socketClient = null;

    int porta = 6789;

    DataOutputStream out;
    DataInputStream in;

    BufferedReader tastiera;

    public Socket connetti() {
        try {
            socketClient = new Socket(InetAddress.getLocalHost(), porta);
            in = new DataInputStream(socketClient.getInputStream());
            out = new DataOutputStream(socketClient.getOutputStream());
        } catch (UnknownHostException e) {
            // svr non raggiungibile
            System.err.println("host sconosciuto");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return socketClient;
    }

    public void comunica (){
        tastiera = new BufferedReader(new InputStreamReader(System.in));
        try {
            String messaggio = tastiera.readLine();
            out.writeBytes(messaggio);
            String ricevuta = in.readLine();
            System.out.print(ricevuta);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.connetti();
        c.comunica();
    }
}
