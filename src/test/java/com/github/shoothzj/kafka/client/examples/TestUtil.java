package com.github.shoothzj.kafka.client.examples;

import java.net.ServerSocket;

public class TestUtil {

    public static int getFreePort() throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(0)) {
            return serverSocket.getLocalPort();
        }
    }

}
