package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws UnknownHostException, IOException {

        try(Socket socket = new Socket("B112M44", 5656);
//		Socket socket = new Socket("172.16.60.85", 5656);
            Scanner sc = new Scanner(System.in);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        ){

            while(true) {

                System.out.println("Enter product id to find: ");
                int productId = sc.nextInt();

                out.writeInt(productId);

//				Received

                String rs = in.readUTF();
                System.out.println(rs);

            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
