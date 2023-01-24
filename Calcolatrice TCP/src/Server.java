import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    Socket socketClient = null;
    ServerSocket server = null;

    int porta = 6789;

    DataOutputStream out;
    DataInputStream in;

    public Socket attendi() {
        try {
            server = new ServerSocket(porta);
            socketClient = server.accept();
            server.close();

            in = new DataInputStream(socketClient.getInputStream());
            out = new DataOutputStream(socketClient.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return socketClient;
    }

    public void comunica (){
        try{
           String letto = in.readLine();
        String risposta = letto.toUpperCase(); 
        out.writeBytes(risposta);
        }catch (IOException e){
            e.printStackTrace();
        }
        
    }

    public static void main(String args[]) {
        //il server si mette in ascolto
        Server s = new Server();
        s.attendi();
        s.comunica();
    }
}
