import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws UnknownHostException,
            IOException, ClassNotFoundException {
        System.out.println("welcome client");
        Socket socket = new Socket("localhost", 4444);
        System.out.println("Client connected");

        ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
        System.out.println("Ok");
        mainframeController temp = new mainframeController();
        order o = temp.get_order();
        os.writeObject(o);
        System.out.println("Sending information to the server ...");

        DataInputStream  input   = null;
        DataOutputStream out     = null;

//        input  = new DataInputStream(socket.getInputStream());
//        String output = input.readUTF();
//        System.out.println(output);
//        ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
//        Message returnMessage = (Message) is.readObject();
//        System.out.println("return Message is=" + returnMessage.result());
        socket.close();
    }
}

