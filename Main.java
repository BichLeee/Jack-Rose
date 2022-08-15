
// Nhat iu Bich
// Bich iu Nhat
//package socket;
import java.io.*;
import java.net.*;

public class Main {

    String sentence_to_server = "";
    String sentence_from_server = "";

    public static void main(String args[]) throws IOException {
        Menu menu = Menu.getInstance();
        menu.printMenu();

        Client client = new Client();
        String ip = "192.168.3.166";
        // String ip = "127.0.0.1";
        client.startConnection(ip, 7777);
        // String response = client.sendMessage("KN nhu cc");
        // System.out.println(response);

    }

}