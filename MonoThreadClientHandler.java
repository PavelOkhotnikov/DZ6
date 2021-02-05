package com.company;

import java.net.Socket;

public abstract class MonoThreadClientHandler implements Runnable {
    public MonoThreadClientHandler(Socket client) {
    }
}
