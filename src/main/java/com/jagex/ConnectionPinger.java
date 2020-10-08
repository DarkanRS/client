package com.jagex;

import jaclib.ping.Ping;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ConnectionPinger implements Runnable {

    String ip;
    InetAddress address;
    volatile long ping = -1L;
    volatile boolean checkPing = true;

    void setIp(String ip) {
        this.ip = ip;
        address = null;
        ping = -1L;
        if (this.ip != null) {
            try {
                address = InetAddress.getByName(this.ip);
            } catch (UnknownHostException ignored) {
            }
        }
    }

    void finishPingRequest() {
        checkPing = false;
    }

    @Override
    public void run() {
        while (checkPing) {
            requestPing();
        }
    }

    long getPing() {
        return ping;
    }

    void requestPing() {
        if (address != null) {
            try {
                byte[] bytes_2 = address.getAddress();
                ping = Ping.ping(bytes_2[0], bytes_2[1], bytes_2[2], bytes_2[3], 10000L);
            } catch (Throwable ignored) {
            }
        }
        Class89.sleep(1000L);
    }
}
