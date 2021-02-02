package ru.geekbrains.homework.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    static ServerSocket server;
    static Socket socket;
    static final int PORT = 8189;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            server = new ServerSocket(PORT);
            System.out.println("server started");

            socket = server.accept();
            System.out.println("client connected");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

          Thread thread = new Thread(() -> {
               try{
                   while (true) {
                       out.writeUTF(sc.nextLine());
                   }
               } catch (IOException e) {
                   e.printStackTrace();
               }
          });
          thread.setDaemon(true);
          thread.start();

          while (true){
              String str = in.readUTF();
              if (str.equals("/end")) {
                  System.out.println("client disconnect");
                  out.writeUTF("/end");
                  break;
              } else {
                  System.out.println("Client: " + str);
              }
          }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
