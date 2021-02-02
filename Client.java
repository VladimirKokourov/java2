package ru.geekbrains.homework.lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    static Socket socket;
    static final int PORT = 8189;
    static final String IP_ADDRESS = "localhost";

    static DataInputStream in;
    static DataOutputStream out;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            socket = new Socket(IP_ADDRESS,PORT);
            System.out.println("server connected");

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

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
                    System.out.println("server disconnect");
                    out.writeUTF("/end");
                    break;
                } else {
                    System.out.println("Server: " + str);
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
        }
    }
}