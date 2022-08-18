import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;
import java.util.*;

public class Client {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(String ip, int port) throws UnknownHostException, IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        // String inputLine = sendMessage("KN nhu cc");
        // Scanner sc = new Scanner(System.in);
        // String mess = "";
        // while (true) {
        // if ("end".equals(mess)) {
        // //out.println("good bye");
        // System.out.println("good bye");
        // sc.close();
        // break;
        // } else {
        // // System.out.println("jjServer: "+inputLine);
        // // System.out.print("Me: ");
        // System.out.print("Me: ");
        // mess = sc.nextLine();
        // inputLine = sendMessage(mess);
        // }
        // // out.println(inputLine);
        // }

        // order
        ArrayList<Integer> orderedDish = new ArrayList<Integer>();
        String opt = "a";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------------\n");
            Menu.getInstance().printMenu();
            // ArrayList<Integer> orderedDish = Menu.getInstance().order();

            System.out.println("Your option: ");
            opt = sc.nextLine();
            while (opt.equals("end") == false) {
                orderedDish.add(Integer.parseInt(opt));
                opt = sc.nextLine();
            }

            out.println(orderedDish.size());
            for (Integer i : orderedDish) {
                out.println(i);
                System.out.println(i);
            }
            orderedDish.clear();
            // sc.close();
        }
    }

    public String sendMessage(String msg) throws IOException {
        out.println(msg);
        String resp = in.readLine();
        System.out.println("Server: " + resp);
        return resp;
    }

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }
}