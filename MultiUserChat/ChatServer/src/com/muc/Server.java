package com.muc;

public class Server extends Thread{
    private final int serverPort;

    public Server(int serverPort) {
        this.serverPort = serverPort;
    }

    @Override
    public void run() {
        super.run();
    }
}
